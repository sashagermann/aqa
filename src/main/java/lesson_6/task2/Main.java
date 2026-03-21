package lesson_6.task2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TelDirectory contact = new TelDirectory();

        printAddResult("Джексонов", "+375(29)123-45-67", contact.add("Джексонов", "+375(29)123-45-67"));
        printAddResult("Патриков", "+375(29)987-65-43", contact.add("Патриков", "+375(29)987-65-43"));
        printAddResult("Джексонов", "+375(29)987-65-43", contact.add("Джексонов", "+375(29)987-65-43"));
        printAddResult("Джексонов", "+375(44)777-55-55", contact.add("Джексонов", "+375(44)777-55-55"));

        System.out.println("Джексонов: " + contact.get("Джексонов"));
        System.out.println("Патриков: " + contact.get("Патриков"));
        System.out.println("Гослингов: " + contact.get("Гослингов"));
    }

    private static void printAddResult(String name, String phone, boolean success) {
        if (success) {
            System.out.println(phone + " добавлен.");
        } else {
            System.out.println(phone + " уже занят.");
        }
    }
}