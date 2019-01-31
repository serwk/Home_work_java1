package geekbrains.homeWork_Java1.HomeWork_6;

interface IAnimal {
    public abstract void run(int length);
    public abstract void swim(int length);
    public abstract void jump(float height);
}

abstract class Animal implements IAnimal {
    int limitRun;
    int limitSwim;
    float limitJump;

    Animal(int limitRun, int limitSwim, float limitJump) {
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        this.limitJump = limitJump;
    }

}

