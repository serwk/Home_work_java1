package geekbrains.homeWork_Java1.HomeWork_6;

public class Cat extends Animal {
    Cat (int limitRun, int limitSwim, float limitJump) {
        super(limitRun, 0, limitJump);
    }

    @Override
    public void run(int length) {
        System.out.println("running " + length + " - " + (length <= limitRun));
    }

    @Override
    public void swim(int length) {
        System.out.println("swimming " + length + " - false (cat can't swim)");
    }

    @Override
    public void jump(float height) {
        System.out.println("jump " + height + " - " + (height <= limitJump));
    }

    @Override
    public String toString() {
        return "cat. limit run: " + limitRun + ", limit swim: " + limitSwim + ", limit jump: " + limitJump;
    }

}
