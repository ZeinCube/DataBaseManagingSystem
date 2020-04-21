package RandomQueryGenerator.Generators;

import java.util.Random;

class StringGen extends Generator<String> {
    private static final int MAX_LENGTH = 10;

    @Override
    public String getData() {
        StringBuilder result = new StringBuilder();

        int length = new Random().nextInt(MAX_LENGTH) + 1;

        for (int i = 0; i < length; i++) {
            result.append(new LetterGen().getData().toString());
        }

        return result.toString();
    }
}
