package geekbrains.homeWork_Java1;

/**
Java. Level 1. Home work 3.

@author Sergey Bondarenko
@version dated Jan 19, 2019
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("\nВ какую игру будем играть:? 1 - Угадай число / 2 - Угадай слово");

        int x = sc.nextInt();
        if (x == 1) {
            //Task 1. Game "Guess the number"
            playGuessNumber();
        } else if (x == 2) {
            //Task 2. Game "Guess the word"
            playGuessWord();
        }

    }

    public static void playGuessNumber() {

        int x;

        do {
            Random rand = new Random();
            int num = rand.nextInt(10);

            System.out.println("Отгадайте число от 0 до 9. <Подсказка - " + num + ">");

            boolean win = false;

            for (int i = 0; i < 3; i++) {
                x = sc.nextInt();
                if (x == num) {
                    System.out.println("\nВы выиграли! :)");
                    win = true;
                    break;
                } else if (num > x){
                    System.out.println("Загаданное число больше. Осталось попыток: " + (2-i));
                } else if (num < x) {
                    System.out.println("Загаданное число меньше. Осталось попыток: " + (2-i));
                }

            }
            if (!win) {
                System.out.println("\nВы проиграли! :(");
            }
            System.out.println("\nПовторить игру еще раз? 1 - да / 0 - нет");

         } while (sc.nextInt() == 1);

        sc.close();

         System.out.println("Игра окончена!");

    }

    public static void playGuessWord() {
        System.out.println("Игра \"Угадай слово\" окончена!");

    }
}
