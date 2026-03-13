package lesson_3;

public class Park {
    private String parkName;
    private String parkHours;
    private ParkAddress address;

    public static class ParkAddress {
        private String city;
        private String street;
        private int buildingNum;

        public ParkAddress(String city, String street, int buildingNum) {
            this.city = city;
            this.street = street;
            this.buildingNum = buildingNum;
        }

        public String getFullAddress() {
            return "г. " + city + ", ул. " + street + ", д. " + buildingNum;
        }
    }

    public Park(String parkName, String parkHours, ParkAddress address) {
        this.parkName = parkName;
        this.parkHours = parkHours;
        this.address = address;
    }

    public class Attraction {
        private String attrName;
        private String attrHours;
        private int price;

        public Attraction(String attrName, String attrHours, int price) {
            this.attrName = attrName;
            this.attrHours = attrHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Парк: " + parkName + " Время работы: " + parkHours);
            System.out.println("Адрес: " + address.getFullAddress());
            System.out.println("Аттракцион: " + attrName + " (Работает: " + attrHours + ")");
            System.out.println("Цена: " + price + "$\n");
        }
    }
}