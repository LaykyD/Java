package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_Lesson4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static final int numchips = 4; //количество фишек для выигрыша

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map [i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap () {
        for (int i = 0; i <= SIZE ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn () {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn ()  {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X Y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.printf("Компьютер выбрал координаты %s %s\n", x + 1, y + 1);
        map[y][x] = DOT_0;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x>= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x]  == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean checkWin(char symb) {
        int axis_x;
        int axis_y;
        int diag_a;
        int diag_b;
        for (int i = 0; i <= SIZE - numchips; i++) {
            for (int j = 0; j <= SIZE - numchips; j++) {
                diag_a = 0;
                diag_b = 0;
                for (int k = 0; k < numchips; k++) {
                    axis_x = 0;
                    axis_y = 0;
                    if (map[k + i][k + j] == symb) {
                        diag_a++;
                        if (diag_a == numchips) {
                            return true;
                        }
                    }
                    if (map[k + i][numchips - 1 - k + j] == symb) {
                        diag_b++;
                        if (diag_b == numchips) {
                            return true;
                        }
                    }
                    for (int l = 0; l < numchips; l++) {
                        if (map[k + i][l + j] == symb) {
                            axis_x++;
                            if (axis_x == numchips) {
                                return true;
                            }
                        }
                        if (map[l + j][k + i] == symb) {
                            axis_y++;
                            if (axis_y == numchips) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isMapFull () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Человек победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Компьютер победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
            }
        }
    }
}
