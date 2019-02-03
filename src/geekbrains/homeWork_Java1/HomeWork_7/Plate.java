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
        }
        return false;
     }

    public String toString() {
        return "plate: " + food;
    }
}
