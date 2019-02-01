package geekbrains.homeWork_Java1.HomeWork_6;

import java.util.Random;

public class Dog extends Animal{

    private static Random random = new Random();

    public Dog () {
        super(
                random.nextInt(100) + 450,
                random.nextInt(10) + 5,
                random.nextFloat()*3
        );
    }

    @Override
    public String toString() {
        return "Dog. limit run: " + limitRun + ", limit swim: " + limitSwim + ", limit jump: " + limitJump;
    }
}
