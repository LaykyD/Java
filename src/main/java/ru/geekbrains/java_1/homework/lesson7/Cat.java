package ru.geekbrains.lesson7;

public class Cat {
    protected String name;
    private int appetite;
    protected boolean satiety = false;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate p) {
        p.decreaseFood(appetite);
    }

    public int Appetite () {
        return appetite;
    }

    public void info (String name, boolean satiety) {
        System.out.printf("Cat %s. Satiety: %s \n", name, satiety);
    }
}
