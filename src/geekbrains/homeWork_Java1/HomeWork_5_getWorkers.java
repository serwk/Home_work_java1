package geekbrains.homeWork_Java1;

/**
 Java. Level 1. Home work 5.

 @author Sergey Bondarenko
 @version dated Jan 28, 2019
 */

public class HomeWork_5_getWorkers {

    public static void main(String[] args) {
        HomeWork_5_worker[] workArray = new HomeWork_5_worker[5];

        workArray[0] = new HomeWork_5_worker("Ivanov ivan", "programmer", "ivivan@mailbox.com", "84951234567", 50000, 30);
        workArray[1] = new HomeWork_5_worker("Petrov ivan", "programmer", "petivan@mailbox.com", "84951234067", 80000, 42);
        workArray[2] = new HomeWork_5_worker("Petrov Oleg", "tester", "petoleg@mailbox.com", "84951004567", 30000, 28);
        workArray[3] = new HomeWork_5_worker("Sidorov ivan", "manager", "sidivan@mailbox.com", "84951200567", 90000, 45);
        workArray[4] = new HomeWork_5_worker("Ivanov Nicholas", "director", "ivnich@mailbox.com", "84951234007", 100000, 50);

        for (HomeWork_5_worker worker: workArray) {
            if(worker.getAge() > 40) {
                System.out.println(worker);
            }
        }
    }
}
