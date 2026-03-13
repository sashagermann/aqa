package lesson_3;

public class Main {
    public static void main(String[] args) {
        Products[] productsArray = new Products[5];
        productsArray[0] = new Products("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 1299, true);
        productsArray[1] = new Products("iPhone 17 Pro", "01.09.2025", "Apple Inc.", "USA", 1999, false);
        productsArray[2] = new Products("Msi Venture 17", "01.02.2025", "Msi Co., Ltd", "Taiwan", 1099, false);
        productsArray[3] = new Products("Xiaomi 17", "01.01.2026", "Xiaomi Corp.", "China", 999, true);
        productsArray[4] = new Products("Sony Playstation 5", "01.11.2024", "Sony Group Corp.", "Japan", 799, true);

        System.out.println("Задание 1:");
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("\nТовар №" + (i + 1));
            productsArray[i].printInfo();
        }

        Park.ParkAddress location = new Park.ParkAddress("Гомель", "Советская", 1);
        Park myPark = new Park("Смолянка.", "10:00 - 22:00", location);

        Park.Attraction attr1 = myPark.new Attraction("Колесо обозрения", "10:00 - 22:00", 15);
        Park.Attraction attr2 = myPark.new Attraction("Тарелка", "11:00 - 21:00", 10);
        Park.Attraction attr3 = myPark.new Attraction("Американские горки", "12:00 - 19:00", 15);

        System.out.println("\nЗадание 2:");
        attr1.printInfo();
        attr2.printInfo();
        attr3.printInfo();
    }
}