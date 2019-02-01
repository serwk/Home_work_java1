package geekbrains.homeWork_Java1.HomeWork_6;

abstract class Animal implements JumpAble,RunAble,SwimAble {
    int limitRun;
    int limitSwim;
    float limitJump;

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
  }

