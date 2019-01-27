package geekbrains.homeWork_Java1;

/**
 Java. Level 1. Home work 4.

 Game TicTacToe

 @author Sergey Bondarenko
 @version dated Jan 27, 2019
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork_4 {

    int SIZE = 0;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new HomeWork_4().game();
    }

    void game() {
        random = new Random();
        scanner = new Scanner(System.in);
        initMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        printMap();
        System.out.println("GAME OVER");
    }

    void initMap() {
        System.out.println("Set the field size (3 and more):");
        SIZE = scanner.nextInt();
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1.." + SIZE + "):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {

        //Не работает получение победного хода компьютера!!!
        //Компьютер в данном примере должен сделать ход 2:1
        /*
        x . .
        . o .
        x o x
        */

        //Объединить методы getWinTurn() и !aiBlockTurnUser()
        if (!(getWinTurn() || aiBlockTurnUser())) {
            //провевить выполняется ли поиск победного хода игрока (aiBlockTurnUser) после победы компьютера
            // (когда getWinTurn возвращает тру)
            //чтобы не было двойного хода компьютера

            System.out.println("Произвольный ход компьютера.");
            int x = 0;
            int y = 0;
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(x, y));
            map[y][x] = DOT_O;
        }
    }

    boolean getWinTurn() {

        System.out.println("Поиск победного хода компьютера.");
        int x = 0;
        int y = 0;

        boolean blockBasicDiagonal = true;
        boolean blockSecondaryDiagonal = true;

        int turnUserBasicDiagonal = 0;
        int turnUserSecondaryDiagonal = 0;

        int xBasicDiagonal = 0;
        int yBasicDiagonal = 0;

        int xSecondaryDiagonal = 0;
        int ySecondaryDiagonal = 0;

        for (int i = 0; i < SIZE; i++) {

            // check basic diagonal
            if (map[i][i] == DOT_X) {
                blockBasicDiagonal = false;
            } else if (map[i][i] == DOT_O) {
                turnUserBasicDiagonal++;
            } else if (map[i][i] == DOT_EMPTY) {
                xBasicDiagonal = i;
                yBasicDiagonal = i;
            }

            if (blockBasicDiagonal && (turnUserBasicDiagonal == SIZE - 1)) {
                x = xBasicDiagonal;
                y = yBasicDiagonal;
                map[x][y] = DOT_O;
                return true;
            }

            // check secondary diagonal
            if (map[i][SIZE - (i + 1)] == DOT_X) {
                blockSecondaryDiagonal = false;
            } else if (map[i][SIZE - (i + 1)] == DOT_O) {
                turnUserSecondaryDiagonal++;
            } else if (map[i][SIZE - (i + 1)] == DOT_EMPTY) {
                xSecondaryDiagonal = i;
                ySecondaryDiagonal = SIZE - (i + 1);
            }

            if (blockSecondaryDiagonal && (turnUserSecondaryDiagonal == SIZE - 1)) {
                x = xSecondaryDiagonal;
                y = ySecondaryDiagonal;
                map[x][y] = DOT_O;
                return true;
            }

            boolean blockHorizontal = true;
            boolean blockVertical = true;

            int turnUserHorizontal = 0;
            int turnUserVertical = 0;

            int xHorizontal = 0;
            int yHorizontal = 0;

            int xVertical = 0;
            int yVertical = 0;

            for (int j = 0; j < SIZE; j++) {

                 // check horizontal
                if (map[i][j] == DOT_X) {
                    blockHorizontal = false;
                } else if (map[i][j] == DOT_O) {
                    turnUserHorizontal++;
                } else if (map[i][j] == DOT_EMPTY) {
                    xHorizontal = i;
                    yHorizontal = j;
                }

                if (blockHorizontal && (turnUserHorizontal == SIZE - 1)) {
                    x = xHorizontal;
                    y = yHorizontal;
                    map[x][y] = DOT_O;
                    return true;
                }

                // check vertical
                if (map[j][i] == DOT_X) {
                    blockVertical = false;
                } else if (map[j][i] == DOT_O) {
                    turnUserVertical++;
                } else if (map[j][i] == DOT_EMPTY) {
                    xVertical = j;
                    yVertical = i;
                }

                if (blockVertical && (turnUserVertical == SIZE - 1)) {
                    x = xVertical;
                    y = yVertical;
                    map[x][y] = DOT_O;
                    return true;
                }
            }
        }
        return false;
    }

    boolean aiBlockTurnUser() {

        System.out.println("Поиск победного хода игрока для его блокировки.");

        int x = 0;
        int y = 0;

        boolean blockBasicDiagonal = true;
        boolean blockSecondaryDiagonal = true;

        int turnUserBasicDiagonal = 0;
        int turnUserSecondaryDiagonal = 0;

        int xBasicDiagonal = 0;
        int yBasicDiagonal = 0;

        int xSecondaryDiagonal = 0;
        int ySecondaryDiagonal = 0;

        for (int i = 0; i < SIZE; i++) {

            // check basic diagonal
            if (map[i][i] == DOT_O) {
                blockBasicDiagonal = false;
            } else if (map[i][i] == DOT_X) {
                turnUserBasicDiagonal++;
            } else if (map[i][i] == DOT_EMPTY) {
                xBasicDiagonal = i;
                yBasicDiagonal = i;
            }

            if (blockBasicDiagonal && (turnUserBasicDiagonal == SIZE - 1)) {
                x = xBasicDiagonal;
                y = yBasicDiagonal;
                map[x][y] = DOT_O;
                return true;
            }

            // check secondary diagonal
            if (map[i][SIZE - (i + 1)] == DOT_O) {
                blockSecondaryDiagonal = false;
            } else if (map[i][SIZE - (i + 1)] == DOT_X) {
                turnUserSecondaryDiagonal++;
            } else if (map[i][SIZE - (i + 1)] == DOT_EMPTY) {
                xSecondaryDiagonal = i;
                ySecondaryDiagonal = SIZE - (i + 1);
            }

            if (blockSecondaryDiagonal && (turnUserSecondaryDiagonal == SIZE - 1)) {
                x = xSecondaryDiagonal;
                y = ySecondaryDiagonal;
                map[x][y] = DOT_O;
                return true;
            }

            boolean blockHorizontal = true;
            boolean blockVertical = true;

            int turnUserHorizontal = 0;
            int turnUserVertical = 0;

            int xHorizontal = 0;
            int yHorizontal = 0;

            int xVertical = 0;
            int yVertical = 0;

            for (int j = 0; j < SIZE; j++) {

                // check horizontal
                if (map[i][j] == DOT_O) {
                    blockHorizontal = false;
                } else if (map[i][j] == DOT_X) {
                    turnUserHorizontal++;
                } else if (map[i][j] == DOT_EMPTY) {
                    xHorizontal = i;
                    yHorizontal = j;
                }

                if (blockHorizontal && (turnUserHorizontal == SIZE - 1)) {
                    x = xHorizontal;
                    y = yHorizontal;
                    map[x][y] = DOT_O;
                    return true;
                }

                // check vertical
                if (map[j][i] == DOT_O) {
                    blockVertical = false;
                } else if (map[j][i] == DOT_X) {
                    turnUserVertical++;
                } else if (map[j][i] == DOT_EMPTY) {
                    xVertical = j;
                    yVertical = i;
                }

                if (blockVertical && (turnUserVertical == SIZE - 1)) {
                    x = xVertical;
                    y = yVertical;
                    map[x][y] = DOT_O;
                    return true;
                }
            }
        }
        return false;
    }



    boolean checkWin(char dt) {

        boolean winBasicDiagonal = true;
        boolean winSecondaryDiagonal = true;

        for (int i = 0; i < SIZE; i++) {

            boolean winHorizontal = true;
            boolean winVertical = true;

            // check basic diagonal
            if (map[i][i] != dt) {
                winBasicDiagonal = false;
            }

             // check secondary diagonal
            if (map[i][SIZE - (i + 1)] != dt) {
                winSecondaryDiagonal = false;
            }

            if ((winBasicDiagonal || winSecondaryDiagonal) && i == (SIZE - 1)) {
                return true;
            }

            for (int j = 0; j < SIZE; j++) {
                // check horizontal
                if (map[i][j] != dt) {
                    winHorizontal = false;
                }

                // check vertical
                if (map[j][i] != dt) {
                    winVertical = false;
                }

                if ((winHorizontal || winVertical) && j == (SIZE - 1)) {
                    return true;
                }
            }
        }
         return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY; // by DSerov
    }
}
