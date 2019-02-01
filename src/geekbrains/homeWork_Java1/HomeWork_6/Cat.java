package geekbrains.homeWork_Java1.HomeWork_6;

import java.util.Random;

public class Cat extends Animal {

    private static Random random = new Random();

    public Cat () {
        super(
                random.nextInt(100) + 150,
                0,
                random.nextFloat()*3
        );
    }

    @Override
    public String toString() {
        return "Cat. limit run: " + limitRun + ", limit swim: " + limitSwim + ", limit jump: " + limitJump;
    }
}
