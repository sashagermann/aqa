package lesson_4;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void infoBowl() {
        System.out.println("В миске осталось " + food + " грамм еды");
    }
}

