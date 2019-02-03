package geekbrains.homeWork_Java1.HomeWork_7;

public class Plate {
    private int food;
    public Plate (int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if(n <= food) {
            food -= n;
            return true;
        } else {
            return false;
        }
    }

    public void info () {
        System.out.println("plate: " + food);
    }

    int getFood() {
        return food;
    }
}
