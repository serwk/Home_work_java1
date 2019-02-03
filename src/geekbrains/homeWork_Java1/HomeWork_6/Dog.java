package geekbrains.homeWork_Java1.HomeWork_6;

public class Dog extends Animal{

    public Dog () {
        super(
                random.nextInt(100) + 450,
                random.nextInt(10) + 5,
                random.nextFloat()*3
        );
    }
}
