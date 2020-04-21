package RandomQueryGenerator.Generators;

import java.util.Random;

class LetterGen extends Generator<Character> {
    public LetterGen() { }

    @Override
    public Character getData() {
        return (char) (new Random().nextInt(26) + 'A');
    }
}
