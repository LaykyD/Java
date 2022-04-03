package ru.geekbrains.lesson6;

public class Dog extends Animal {
    private static final int RunLimit = 500;
    private static final int SwimLimit = 10;
    private static int DogCount = 0;

    public Dog(String name) {
        super(name);
        DogCount++;
    }

    @Override
    public void Running(int RunDist) {
        if (RunDist <= RunLimit) {
            System.out.printf("The dog %s ran the distance: %s m\n", name, RunDist);
        }
        else {
            System.out.printf("The dog %s will not be to run the distance: %s m\n", name, RunDist);
        }
    }

    @Override
    public void Swimming(int SwimDist) {
        if (SwimDist <= SwimLimit) {
            System.out.printf("The dog %s swam the distance: %s m\n", name, SwimDist);
        } else {
            System.out.printf("The dog %s can't swim the distance: %s m\n", name, SwimDist);
        }
    }

    public static void NumDogs() {
        System.out.printf("Общее количество собак: %s\n", DogCount);
    }

}
