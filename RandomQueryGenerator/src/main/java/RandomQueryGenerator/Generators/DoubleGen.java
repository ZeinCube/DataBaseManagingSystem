package RandomQueryGenerator.Generators;

import java.util.Random;

class DoubleGen extends Generator<Double> {

    @Override
    public Double getData() {
        return new Random().nextDouble();
    }
}
