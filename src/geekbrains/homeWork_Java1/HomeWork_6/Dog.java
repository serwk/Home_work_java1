package geekbrains.homeWork_Java1.HomeWork_6;

public class Dog extends Animal{
    Dog (int limitRun, int limitSwim, float limitJump) {
        super(limitRun, limitSwim, limitJump);
    }

    @Override
    public void run(int length) {
        System.out.println("running " + length + " - " + (length <= limitRun));
    }

    @Override
    public void swim(int length) {
        System.out.println("swimming " + length + " - " + (length <= limitSwim));
    }

    @Override
    public void jump(float height) {
        System.out.println("jump " + height + " - " + (height <= limitJump));
    }

    @Override
    public String toString() {
        return "dog. limit run: " + limitRun + ", limit swim: " + limitSwim + ", limit jump: " + limitJump;
    }

}
