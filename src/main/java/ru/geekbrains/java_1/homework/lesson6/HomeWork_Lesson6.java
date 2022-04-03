package ru.geekbrains.lesson6;

public class HomeWork_Lesson6 {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik"),
                new Cat("Murzik")
        };

        Dog[] dogs = {
                new Dog("Bobik"),
                new Dog("Belka"),
                new Dog("Strelka")
        };

        cats[0].Running(180);
        cats[1].Running(210);
        System.out.println();

        cats[0].Swimming(0);
        cats[1].Swimming(10);
        System.out.println();

        dogs[0].Running(300);
        dogs[1].Running(600);
        dogs[2].Running(450);
        System.out.println();

        dogs[0].Swimming(9);
        dogs[1].Swimming(15);
        System.out.println();

        Cat.NumCats();
        Dog.NumDogs();
        Animal.NumAnimals();

    }
}
