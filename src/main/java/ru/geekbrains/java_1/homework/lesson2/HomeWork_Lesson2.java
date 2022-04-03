package ru.geekbrains.lesson2;

public class HomeWork_Lesson2 {
    public static void main(String[] args) {

        System.out.println("Task1:\n" + task1(10, 10));
        System.out.println("Task2:");
        task2(0);
        System.out.println("Task3:\n" + task3(7));
        System.out.println("Task4:");
        task4("Текст", 3);
        System.out.println("Task5_Method_1:\n" + task5_1(1900));
        System.out.println("Task5_Method_2:\n" + task5_2(2000));

    }
/**      1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
     от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.     */

    public static boolean task1 (int a, int b) {
        if (a + b >= 10 && a + b <=20) {
            return true;
        }
        else {
            return false;
        }
    }

/**     2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.    */

    public static void task2 (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

/**     3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если
     число отрицательное, и вернуть false если положительное.    */

    public static boolean task3 (int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }

/**      4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
 в консоль указанную строку, указанное количество раз.   */

    public static void task4 (String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

/**      5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
 (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
 при этом каждый 400-й – високосный.     */


    /** Способ №1  */

    public static boolean task5_1 (int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    /** Способ №2  */

        public static boolean task5_2 (int year) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
}
