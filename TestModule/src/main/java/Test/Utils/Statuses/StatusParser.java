package Test.Utils.Statuses;

import java.util.regex.Pattern;


public class StatusParser {
    public enum Statuses {OK, DB_ERROR, PARSER_ERROR}

    private static final String DB_ERROR_REGEX;
    private static final String PARSER_ERROR_REGEX;

    static {
        PARSER_ERROR_REGEX = "^line \\d+:\\d+ mismatched input.*";
        DB_ERROR_REGEX = "^class Engine\\.Exceptions.*";
    }

    public static Status parse(String command, String answer) {
        Status status = new Status(command, answer);

        if (Pattern.matches(PARSER_ERROR_REGEX, answer)) {
            status.setStatus(Statuses.PARSER_ERROR.toString());
        } else if (Pattern.matches(DB_ERROR_REGEX, answer)) {
            status.setStatus(Statuses.DB_ERROR.toString());
        } else {
            status.setStatus(Statuses.OK.toString());
        }

        return status;
    }
}

