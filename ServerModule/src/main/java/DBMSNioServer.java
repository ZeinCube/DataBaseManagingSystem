import Logic.ParserManager;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

import java.util.logging.Level;
import java.util.logging.Logger;

class DBMSNioServer implements Runnable {
    private final Logger log = Logger.getLogger("DBMS Nio Server");

    private final int BUFFER_SIZE = 2048;
    private final ByteBuffer buffer = ByteBuffer.allocate(BUFFER_SIZE);
    private final ParserManager manager = new ParserManager();
    private ServerSocketChannel serverSocketChannel;
    private Selector selector;
    private int port = 10274;

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
        log.info("Server started on port " + this.port);

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
            log.log(Level.SEVERE, "Exception", e);
        }
    }

    private void handleAccept(SelectionKey key) throws IOException {
        SocketChannel clientChannel = ((ServerSocketChannel) key.channel()).accept();

        StringBuilder address = new StringBuilder();
        address.append(clientChannel.socket().getInetAddress().toString());
        address.append(":").append(clientChannel.socket().getPort());

        clientChannel.configureBlocking(false);
        clientChannel.register(selector, SelectionKey.OP_READ, address.toString());

        log.info("Accepted connection from: " + address.toString());
    }

    private void handleRead(SelectionKey key) throws IOException {
        SocketChannel clientChannel = (SocketChannel) key.channel();
        StringBuilder queryBuilder = new StringBuilder();

        int read;
        while ((read = clientChannel.read(buffer)) > 0) {
            buffer.flip();

            byte[] bytes = new byte[buffer.limit()];
            buffer.get(bytes);

            queryBuilder.append(new String(bytes));
            buffer.clear();
        }

        String query = queryBuilder.toString();

        log.info("Got " + query.getBytes().length + " bytes from client " + getAddress((SocketChannel) key.channel()));

        if (query.equals("exit") || read < 0) {
            clientChannel.close();
            disconnectClient(key);
            return;
        }

        String msg = manager.parse(query).trim();

        log.info("Sent " + msg.getBytes().length + " bytes to client " + getAddress((SocketChannel) key.channel()));

        clientChannel.write(ByteBuffer.wrap(msg.getBytes()));
    }

    private String getAddress(SocketChannel channel) {
        return channel.socket().getInetAddress().toString() + ":" + channel.socket().getLocalPort();
    }

    private void disconnectClient(SelectionKey key) {
        log.info("Disconnected client : " + getAddress((SocketChannel) key.channel()));
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
