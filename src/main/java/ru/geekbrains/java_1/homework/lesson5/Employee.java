package ru.geekbrains.lesson5;

public class Employee {
    public String fullname;
    public String post;
    public String email;
    public int phone;
    public int wages;
    public int age;

    public Employee(String fullname, String post, String email, int phone, int wages, int age) {
        this.fullname = fullname;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }

    public int Age() {
        return age;
    }

    public void Info() {
        System.out.println("ФИО сотрудника: " + fullname );
        System.out.println("Должность: " + post);
        System.out.println("Электронный адрес: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Заработная плата: " + wages);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

}
