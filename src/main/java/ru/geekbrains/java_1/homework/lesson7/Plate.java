package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public void decreaseFood (int n) {
        food -= n;
    }

    public void addFood (int n) {
        food += n;
        System.out.printf("You added %s meals to the bowl\n", n);
    }

   public int Food () {
        return food;
    }

    public void info () {
        System.out.println("The rest of the feed in the bowl: " + food);
        System.out.println();
    }
}
