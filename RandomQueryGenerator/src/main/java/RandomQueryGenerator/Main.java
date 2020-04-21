package RandomQueryGenerator;

import RandomQueryGenerator.Generators.DataGenerator;

public class Main {
    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();

        for (int i = 0; i < 10; i++) {
            System.out.print(generator.getData("_letter") + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(generator.getData("_digit") + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(generator.getData("_string") + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(generator.getData("_number") + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(generator.getData("_double") + " ");
        }
        System.out.println();
    }
}
