package lesson_7;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTests {
    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println("Запуск теста: " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Тест факториала положительного числа 7")
    void testFactorialPos() {
        long result = Factorial.factorial(7);
        assertEquals(5040, result);
        System.out.println("Результат: 7! = " + result);
    }

    @Test
    @DisplayName("Тест факториала отрицательного числа -7")
    void testFactorialNeg() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-7));
        System.err.println("Результат: " + exception.getMessage());
    }

    @Test
    @DisplayName("Тест площади треугольника со сторонами 3, 4, 5")
    void testTriangleArea() {
        assertEquals(6.0, TriangleArea.getArea(3, 4, 5), 0.001);
        System.out.println("Результат: Площадь треугольника 6.0");
    }

    @Test
    @DisplayName("Тест площади треугольника с отрицательной стороной")
    void testTriangleAreaNeg() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> TriangleArea.getArea(-3, 4, 5));
        System.err.println("Результат: " + exception.getMessage());
    }

    @Test
    @DisplayName("Тест сложения: 10 + 5")
    void testAddition() {
        double result = ArithOperations.calculator(10, 5, '+');
        assertEquals(15.0, result);
        System.out.println("Результат сложения: " + result);
    }

    @Test
    @DisplayName("Тест вычитания: 10 - 5")
    void testSubtraction() {
        double result = ArithOperations.calculator(10, 5, '-');
        assertEquals(5.0, result);
        System.out.println("Результат вычитания: " + result);
    }

    @Test
    @DisplayName("Тест умножения: 10 * 5")
    void testMultiplication() {
        double result = ArithOperations.calculator(10, 5, '*');
        assertEquals(50.0, result);
        System.out.println("Результат умножения: " + result);
    }

    @Test
    @DisplayName("Тест деления: 10 / 5")
    void testDivision() {
        double result = ArithOperations.calculator(10, 5, '/');
        assertEquals(2.0, result);
        System.out.println("Результат деления: " + result);
    }

    @Test
    @DisplayName("Тест деления на ноль")
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> ArithOperations.calculator(10, 0, '/'));
        System.err.println("Ошибка при делении на ноль: " + exception.getMessage());
    }

    @Test
    @DisplayName("Тест неверной операции")
    void testInvalidOperation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> ArithOperations.calculator(10, 5, '?'));
        System.err.println("Ошибка: неверная операция" + exception.getMessage());
    }

    @Test
    @DisplayName("Сравнение чисел: первое число больше")
    void testCompareGreater() {
        String result = IntCompare.compare(10, 5);
        assertEquals("a > b", result);
        System.out.println("Результат: " + result);
    }

    @Test
    @DisplayName("Сравнение чисел: первое число меньше")
    void testCompareLess() {
        String result = IntCompare.compare(3, 7);
        assertEquals("a < b", result);
        System.out.println("Результат: " + result);
    }

    @Test
    @DisplayName("Сравнение чисел: числа равны")
    void testCompareEqual() {
        String result = IntCompare.compare(7, 7);
        assertEquals("a == b", result);
        System.out.println("Результат: " + result);
    }
}