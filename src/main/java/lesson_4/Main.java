package lesson_4;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурка");

        dog1.run(150);
        dog1.swim(5);
        cat1.run(250);
        cat1.swim(5);

        System.out.println("Всего животных: " + Animals.countAnimals);
        System.out.println("Собак: " + Dog.countDogs);
        System.out.println("Котов: " + Cat.countCats);

        Bowl bowl = new Bowl(45);

        Cat[] cats = {new Cat("Мурка"), new Cat("Барсик"), new Cat("Снежок"), new Cat("Рыжик")};

        System.out.println("\nКормим котов:");
        bowl.infoBowl();

        int[] appetites = {10, 20, 10, 15};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl, appetites[i]);
        }

        System.out.println("\nСытость котов:");
        for (Cat cat : cats) {
            cat.infoFullness();
        }
        bowl.infoBowl();
    }
}