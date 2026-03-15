package lesson_4.Geometry;

public class Geometry {
    public static void main(String[] args) {
        Circle circle = new Circle(7, "Красный", "Желтый");
        Rectangle rectangle = new Rectangle(4, 3, "Зеленый", "Оранжевый");
        Triangle triangle = new Triangle(3, 4, 5, "Синий", "Желтый");

        System.out.println("Круг: " + circle.getInfo());
        System.out.println("\nПрямоугольник: " + rectangle.getInfo());
        System.out.println("\nТреугольник: " + triangle.getInfo());
    }
}

