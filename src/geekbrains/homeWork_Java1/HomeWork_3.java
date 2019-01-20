package geekbrains.homeWork_Java1;

/**
Java. Level 1. Home work 3.

@author Sergey Bondarenko
@version dated Jan 20, 2019
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

         System.out.println("\nИгра \"Угадай число\" окончена!");

    }

    public static void playGuessWord() {

        String x;

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();

        // selected word
        String word = words[rand.nextInt(25)];

        System.out.println("Отгадайте слово. <Подсказка - " + word + ">");

        while (true){

            x = sc.next();
            if (word.equals(x)) {
                System.out.println("\nВы выиграли! :)");
                break;
            } else {
                String tip = "";
                int wordLength = (word.length() > x.length())? x.length():word.length();
                // to find the matching letters
                for (int i = 0; i < wordLength; i++) {
                    tip += (word.charAt(i) == x.charAt(i))? word.charAt(i):'#';
                }

                // add special characters to the string
                for (int i = 0; i < (15 - wordLength); i++) {
                    tip += '#';
                }

                System.out.println("Попробуйте еще раз. Подсказка: " + tip);
            }
         }

        sc.close();

        System.out.println("\nИгра \"Угадай слово\" окончена!");
    }
}
