package lesson_7;

public class TriangleArea {
    public static double getArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны должны быть > 0");
        }
        // Полупериметр
        double p = (a + b + c) / 2;
        // Формула Герона: √ (p * (p - a) * (p - b) * (p - c))
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

