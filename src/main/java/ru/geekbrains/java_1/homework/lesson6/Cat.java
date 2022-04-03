package ru.geekbrains.lesson6;

public class Cat extends Animal {
    private static final int RunLimit = 200;
    private static final int SwimLimit = 0;
    private static int CatCount = 0;


    public Cat(String name) {
        super(name);
        CatCount++;
    }

    @Override
    public void Running(int RunDist) {
        if (RunDist <= RunLimit) {
            System.out.printf("The cat %s ran the distance: %s m\n", name, RunDist);
        }
        else {
            System.out.printf("The cat %s will not be to run the distance: %s m\n", name, RunDist);
        }
    }

    @Override
    public void Swimming(int SwimDist) {
        if (SwimDist == SwimLimit) {
            System.out.printf("The cat %s does not know how to swim and he is glad that he does not need to swim.\n", name);
        } else {
            System.out.printf("The cat %s does not know how to swim and will not be able to swim the distance: %s m\n", name, SwimDist);
        }
    }

    public static void NumCats() {
        System.out.printf("Общее количество котов: %s\n", CatCount);
    }
}
