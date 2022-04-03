package ru.geekbrains.lesson5;

public class HomeWork_Lesson5 {
    public static void main(String[] args) {

        Employee[] employeearr = new Employee[5];
        employeearr[0] = new Employee("Иванов Иван Иванович", "Генеральный директор", "iii@mail.ru", 11111, 80000, 43);;
        employeearr[1] = new Employee("Петров Иван Иванович", "Начальник отдела", "pii@mail.ru", 22222, 60000, 41);
        employeearr[2] = new Employee("Сидоров Иван Иванович", "Ведущий менеджер", "sii@mail.ru", 33333, 50000, 26);
        employeearr[3] = new Employee("Иванов Петр Иванович", "Менеджер", "ipi@mail.ru", 44444, 40000, 25);
        employeearr[4] = new Employee("Иванов Иван Петрович", "Менеджер", "iip@mail.ru", 44444, 40000, 22);

        for (int i = 0; i < employeearr.length; i++) {
            if (employeearr[i].Age() > 40) {
                System.out.println("Сотрудник №" + (i + 1) + ":" );
                employeearr[i].Info();
            }
        }

    }
}
