package geekbrains.homeWork_Java1.HomeWork_6;

public class Cat extends Animal {

    public Cat () {
        super(
                random.nextInt(100) + 150,
                0,
                random.nextFloat()*3
        );
    }
}

