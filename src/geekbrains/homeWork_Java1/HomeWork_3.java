package geekbrains.homeWork_Java1;

/**
Java. Level 1. Home work 3.

@author Sergey Bondarenko
@version dated Jan 20, 2019
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {

    private static Scanner sc = new Scanner(System.in);

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
        sc.close();
    }

    private static void playGuessNumber() {

        Random rand = new Random();
        do {
            int randNum = rand.nextInt(10);

            System.out.println("Отгадайте число от 0 до 9. <Подсказка - " + randNum + ">");

            for (int i = 0; i < 3; i++) {
                int userNum = sc.nextInt();
                if (userNum == randNum) {
                    System.out.println("\nВы выиграли! :)");
                    break;
                } else if (i == 2) {
                    System.out.println("\nВы проиграли! :(");
                } else if (randNum > userNum){
                    System.out.println("Загаданное число больше. Осталось попыток: " + (2-i));
                } else if (randNum < userNum) {
                    System.out.println("Загаданное число меньше. Осталось попыток: " + (2-i));
                }
            }
            System.out.println("\nПовторить игру еще раз? 1 - да / 0 - нет");

         } while (sc.nextInt() == 1);

         System.out.println("\nИгра \"Угадай число\" окончена!");
    }

    private static void playGuessWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();

        // selected word
        String word = words[rand.nextInt(words.length)];

        System.out.println("Отгадайте слово. <Подсказка - " + word + ">");

        StringBuilder tip = new StringBuilder();
        while (true){

            String userWord = sc.next();
            if (word.equals(userWord)) {
                System.out.println("\nВы выиграли! :)");
                break;
            } else {
                int wordLength = (int) Math.min(word.length(),userWord.length());
                // to find the matching letters
                for (int i = 0; i < wordLength; i++) {
                    boolean matchedChar = (word.charAt(i) == userWord.charAt(i));
                    if (tip.length()  <= i) {
                        tip.append((matchedChar) ? word.charAt(i) : '#');
                    } else if ((tip.charAt(i) == '#')&& matchedChar) {
                         tip.setCharAt(i,word.charAt(i));
                    }
                }

                // add special characters to the string
                if (tip.length()<15) {
                    for (int i = 0; i < (15 - wordLength); i++) {
                        tip.append('#');
                    }
                }

                System.out.println("Попробуйте еще раз. Подсказка: " + tip);
            }
         }
        System.out.println("\nИгра \"Угадай слово\" окончена!");
    }
}
