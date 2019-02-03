package geekbrains.homeWork_Java1.HomeWork_7;

public class HomeWork_7 {
    public static void main (String [] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Marsik",5);
        cats[1] = new Cat("Barsik",3);
        cats[2] = new Cat("Mursik",4);
        cats[3] = new Cat("Pushok",1);
        cats[4] = new Cat("Markis",3);

        Plate plate = new Plate(10);

        System.out.print(plate);

        for (Cat cat: cats) {
            cat.eat(plate);
            System.out.printf("\n%s \t%s",
                    cat,
                    plate);
        }
    }
}
