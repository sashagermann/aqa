package lesson_4;

public class Cat extends Animals {
    public static int countCats = 0;
    private boolean fullness = false;

    public Cat(String name) {
        super(name, 200, 0);
        countCats++;
    }

    public void eat(Bowl bowl, int countEat) {
        if (bowl.decreaseFood(countEat)) {
            fullness = true;
            System.out.println(name + " поел " + countEat + " грамм еды и теперь не хочет есть");
        } else {
            System.out.println(name + " не смог поесть, недостаточно еды");
        }
    }
    public void infoFullness() {
        System.out.println(name + (fullness ? " сытый" : " голодный"));
    }
}