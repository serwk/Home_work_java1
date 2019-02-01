package geekbrains.homeWork_Java1.HomeWork_6;

import java.util.Random;

public class HomeWork_6 {

    private static Random random = new Random();

    public static void main (String[] args) {
        Animal[] animals = {
                createAnimal(),
                createAnimal(),
                createAnimal(),
                createAnimal()
        };

        for (Animal animal : animals) {
            System.out.println("\n" + animal);
            animal.run(170);
            animal.swim(5);
            animal.jump(2.0f);
        }
    }

    public static Animal createAnimal () {
        return (random.nextBoolean())? new Cat(): new Dog();
    }
}
