package geekbrains.homeWork_Java1.HomeWork_6;

import java.util.Random;

abstract class Animal implements JumpAble,RunAble,SwimAble {
    private int limitRun;
    private int limitSwim;
    private float limitJump;

    static Random random = new Random();

    Animal(int limitRun, int limitSwim, float limitJump) {
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        this.limitJump = limitJump;
    }

    public void run(int length) {
        System.out.println("running " + length + " - " + (length <= limitRun));
    }

    public void swim(int length) {
        System.out.println("swimming " + length + " - " + (length <= limitSwim));
    }

    public void jump(float height) {
        System.out.println("jump " + height + " - " + (height <= limitJump));
    }

    public String toString() {
        return String.format("%s. run:%d swim:%d jump:%.2f",
                this.getClass().getSimpleName(),
                limitRun,
                limitSwim,
                limitJump);
    }

}

