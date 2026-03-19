package lesson_3;

public class Products {
    private String productName;
    private String prodDate;
    private String manufacturer;
    private String prodCountry;
    private int price;
    private boolean bookingStatus;

    public Products(String productName, String prodDate, String manufacturer, String prodCountry, int price, boolean bookingStatus) {
        this.productName = productName;
        this.prodDate = prodDate;
        this.manufacturer = manufacturer;
        this.prodCountry = prodCountry;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "Название товара: " + productName + "\nДата производства: " +
                prodDate + "\nПроизводитель: " + manufacturer + "\nСтрана происхождения: " +
                prodCountry + "\nЦена: " + price + "$" + "\nСостояние бронирования покупателем: " + bookingStatus;
    }
}
