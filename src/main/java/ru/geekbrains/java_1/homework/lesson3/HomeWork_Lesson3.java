package ru.geekbrains.lesson3;

import java.util.Random;

public class HomeWork_Lesson3 {

    public static void main(String[] args) {

//        Task1();
//        Task2();
//        Task3();
//        Task4();
//        Task5(5, 3);
//        Task6();
//        Task7(new int[]{1, 2, 3, 3, 3});
//        Task8(new int[]{1, 2, 3, 4, 5, 6, 7}, -1);

    }

/**     1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 *      С помощью цикла и условия заменить 0 на 1, 1 на 0;      */

        public static void Task1 () {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                }
                else arr[i] = 0;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }

/**     2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
 *      1 2 3 4 5 6 7 8 … 100;      */

        public static void Task2 () {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }

/**     3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
 *      умножить на 2;      */

        public static void Task3 () {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] *= 2;
                }
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }

/**     4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
 *      цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 *      Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
 *      то есть [0][0], [1][1], [2][2], …, [n][n];      */

        public static void  Task4 () {
            int x = 5;
            int[][] arr = new int[x][x];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if (i == j) {
                        arr[i][j] = 1;
                    }
                    else if (i + j == x -1) {
                        arr[i][j] = 1;
                    }
                    System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
                }
            }
        }

/**     5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
 *      типа int длиной len, каждая ячейка которого равна initialValue;     */

        public static int[] Task5 (int len, int initiaValue) {
            int[] arr = new int[len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = initiaValue;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
            return arr;
        }

/**     6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;       */

        public static void Task6 () {
            Random random = new Random();
            int x = random.nextInt(20);
            int[] arr = new int[x];
            for (int i = 0; i < arr.length; i++) {
                int y = random.nextInt(50);
                arr[i] = y;
            }
                int min = arr[0];
                int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (min < arr[i]) {
                    min = min;
                }
                else min = arr[i];
            }
            for (int i = 1; i < arr.length; i++) {
                if (max > arr[i]) {
                    max = max;
                }
                else max = arr[i];
            }
            System.out.println("Minimum element: " + min);
            System.out.println("Maximum element: " + max);
        }


/**     7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
 *      true, если в массиве есть место, в котором сумма левой и правой части массива равны.

        Примеры:
        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

        граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.     */

        public static boolean Task7 (int[] arr) {
            int countleft = 0;
            int countright = 0;
            int sumcount = 0;
            int sumleft = arr[0];
            int sumright = arr[arr.length - 1];
            for (int i = 1; i < arr.length; i++) {
                countleft ++;
                countright = 0;
                sumleft += arr[i];
                sumright = arr[arr.length - 1];
                for (int j = arr.length - 2; j >= i + 1 ; j--) {
                    sumright += arr[j];
                    countright ++;
                    sumcount = countleft + countright;
                    if (sumright > sumleft) {
                        break;
                    }
                    if (sumcount == arr.length - 2 && sumleft == sumright) {
                        System.out.println("The sum of the left and right parts are equal");
                        return true;
                    }
                }
            }
            System.out.println("The sums of the left and right parts are not equal");
            return false;
        }

/**     8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
 *      или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются
 *      циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 *      Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
 *      при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.    */

/**     При положительном n сдвиг производится вправо, иначе влево */

        public static void Task8 (int[] arr, int n) {
            if (n >= 0) {
                for (int i = 0; i < n; i++) {
                    int y = arr[arr.length - 1];
                    int x = arr.length - 1;
                    for (int j = 1; j < arr.length; j++) {
                        arr[x] = arr[x - 1];
                        x = x - 1;
                    }
                    arr[0] = y;
                }
            }
            else {
                for (int i = 0; i > n; i--) {
                    int y = arr[0];
                    int x = 0;
                    for (int j = 1; j < arr.length; j++) {
                        arr[x] = arr[x + 1];
                        x = x + 1;
                    }
                    arr[arr.length - 1] = y;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }

}
