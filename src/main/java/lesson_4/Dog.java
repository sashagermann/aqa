package lesson_4;

public class Dog extends Animals {
    public static int countDogs = 0;

    public Dog(String name) {
        super(name, 500, 10);
        countDogs++;
    }
}
