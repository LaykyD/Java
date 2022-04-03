package ru.geekbrains.lesson7;

public class HomeWork_Lesson7 {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Murzik", 15),
                new Cat("Murka", 20),
                new Cat("Sonya", 25),
                new Cat("Tishka", 15)
        };

        Plate plate = new Plate(50);
        plate.info();

        plate.addFood(15);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            if (plate.Food() >= cats[i].Appetite()) {
                System.out.println("The cat managed to eat from a bowl");
                cats[i].eat(plate);
                cats[i].satiety = true;
                cats[i].info(cats[i].name, cats[i].satiety);
                plate.info();
            }
            else {
                System.out.println("The cat does not have enough food in the bowl");
                cats[i].info(cats[i].name, cats[i].satiety);
                plate.info();
            }
        }
    }
}
