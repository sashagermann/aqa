package lesson_7;

public class ArithOperations {
    public static double calculator(int a, int b, char op) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        if (op == '/') {
            if (b == 0) throw new ArithmeticException("Деление на ноль");
            return (double) a / b;
        }
        throw new IllegalArgumentException("Неверная операция");
    }
}
