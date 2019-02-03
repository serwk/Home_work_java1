package geekbrains.homeWork_Java1.HomeWork_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat (String name ,int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    public String toString() {
        return String.format("%s. appetite:%d satiety:%s",
                name,
                appetite,
                satiety);
    }


}