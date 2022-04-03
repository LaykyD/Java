package ru.geekbrains.lesson6;

public abstract class Animal {
    public String name;
    private static int AllCount = 0;

    public Animal(String name) {
        this.name = name;
        AllCount++;
    }

    public void Running(int RunDist) {
        System.out.printf("The animal %s ran the distance: %s m\n", name, RunDist);
    }

    public void Swimming(int SwimDist) {
        System.out.printf("The animal %s swam the distance: %s m\n", name, SwimDist);
    }

    public static void NumAnimals() {
        System.out.printf("Общее количество животных: %s\n", AllCount);
    }
}
