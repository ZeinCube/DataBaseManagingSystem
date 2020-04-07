package Test.Utils.Statuses;

import Test.Utils.Printer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Status {
    private String status;
    private String command;
    private String answer;

    public Status(String command, String answer) {
        this.command = command;
        this.answer = answer;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonStr = "";
        try {
            jsonStr = objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            Printer.printError("Json status mapping error");
        }

        return jsonStr;
    }
}
