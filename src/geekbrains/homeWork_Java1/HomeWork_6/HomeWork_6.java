package geekbrains.homeWork_Java1.HomeWork_6;

public class HomeWork_6 {

    public static void main (String[] args) {
        IAnimal[] cats = {
                new Cat(150, 10,1.0f),
                new Cat(200, 0,3.0f)
        };

        for (IAnimal cat : cats) {
            System.out.println("\n" + cat);
            cat.run(170);
            cat.swim(5);
            cat.jump(2.0f);

        }

        IAnimal[] dogs = {
                new Dog(450, 8,0.2f),
                new Dog(600, 12,0.7f)
        };

        for (IAnimal dog : dogs) {
            System.out.println("\n" + dog);
            dog.run(520);
            dog.swim(10);
            dog.jump(0.5f);

        }
    }
}
