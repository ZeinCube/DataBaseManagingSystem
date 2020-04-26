import Logic.ParserManager;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

class DBMSNioServer implements Runnable {
    private final ParserManager manager = new ParserManager();
    private final ByteBuffer buffer = ByteBuffer.allocate(2048);

    private int port = 10274;

    private ServerSocketChannel serverSocketChannel;
    private Selector selector;

    public DBMSNioServer() throws IOException {
        initServer();
    }

    public DBMSNioServer(int port) throws IOException {
        this.port = port;
        initServer();
    }

    private void initServer() throws IOException {
        this.serverSocketChannel = ServerSocketChannel.open();
        this.serverSocketChannel.socket().bind(new InetSocketAddress(port));
        this.serverSocketChannel.configureBlocking(false);
        this.selector = Selector.open();
        this.serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }

    @Override
    public void run() {
        System.out.println("Started server on port " + this.port);

        try {

            Iterator<SelectionKey> iterator;
            SelectionKey key = null;
            while (this.serverSocketChannel.isOpen()) {
                selector.select();
                iterator = this.selector.selectedKeys().iterator();

                while (iterator.hasNext()) {
                    try {
                        key = iterator.next();
                        iterator.remove();

                        if (!key.isValid()) {
                            continue;
                        }

                        if (key.isAcceptable()) {
                            this.handleAccept(key);
                        }

                        if (key.isReadable()) {
                            this.handleRead(key);
                        }
                    } catch (IOException e) {
                        System.out.println("Exception: " + e.getMessage());
                        disconnectClient(key);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleAccept(SelectionKey key) throws IOException {
        SocketChannel clientChannel = ((ServerSocketChannel) key.channel()).accept();

        StringBuilder address = new StringBuilder();
        address.append(clientChannel.socket().getInetAddress().toString());
        address.append(":").append(clientChannel.socket().getPort());

        clientChannel.configureBlocking(false);
        clientChannel.register(selector, SelectionKey.OP_READ, address.toString());
        clientChannel.write(ByteBuffer.wrap("Connected to DBMS NIO Server".getBytes()));

        System.out.println("Accepted connection from: " + address.toString());
    }

    private void handleRead(SelectionKey key) throws IOException {
        SocketChannel clientChannel = (SocketChannel) key.channel();
        StringBuilder query = new StringBuilder();

        buffer.clear();
        int read = 0;

        while ((read = clientChannel.read(buffer)) > 0) {
            buffer.flip();

            byte[] bytes = new byte[buffer.limit()];
            buffer.get(bytes);

            query.append(new String(bytes));
            buffer.clear();
        }

        if (query.equals("exit;")) {
            disconnectClient(key);
            return;
        }

        String msg;
        if (read < 0) {
            msg = "Client " + getAddress(clientChannel) + " disconnected\n";
            clientChannel.close();
        } else {
            msg = manager.parse(query.toString());
        }

        clientChannel.write(ByteBuffer.wrap(msg.getBytes()));
    }

    private String getAddress(SocketChannel channel) {
        return channel.socket().getInetAddress().toString() + ":" + channel.socket().getLocalPort();
    }

    private void disconnectClient(SelectionKey key) {
        System.out.println("Disconnected client : " + getAddress((SocketChannel) key.channel()));
        key.cancel();
    }

    public static void main(String[] args) {
        DBMSNioServer server = null;

        try {
            server = new DBMSNioServer();
        } catch (IOException e) {
            System.out.println("Unable to start server");
            e.printStackTrace();
        }
        (new Thread(server)).start();
    }
}
