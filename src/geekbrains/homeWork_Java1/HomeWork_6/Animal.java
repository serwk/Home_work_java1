package geekbrains.homeWork_Java1.HomeWork_6;

interface IAnimal {
    boolean run();
    boolean swim();
    boolean jump();
}

abstract class Animal implements IAnimal {
    int limitRun;
    int limitSwim;
    int limitJump;

    Animal(int limitRun, int limitSwim, int limitJump) {
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        this.limitJump = limitJump;
    }

}

