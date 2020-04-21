package RandomQueryGenerator.Generators;

import java.util.Random;

class DigitGen extends Generator<Integer> {
    private static final int MAX_VALUE = 10;

    @Override
    public Integer getData() {
        return new Random().nextInt(MAX_VALUE);
    }
}
