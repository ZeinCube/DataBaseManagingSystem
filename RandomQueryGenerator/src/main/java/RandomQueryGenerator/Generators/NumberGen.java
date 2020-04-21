package RandomQueryGenerator.Generators;

import java.util.Random;

class NumberGen extends Generator<Integer> {

    @Override
    public Integer getData() {
        return new Random().nextInt();
    }
}
