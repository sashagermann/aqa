package lesson_7;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestNGTests {
    @BeforeMethod
    void init(Method method) {
        Test testAnnotation = method.getAnnotation(Test.class);
        System.out.println("Запуск теста: " + testAnnotation.description());
    }

    @Test(description = "Тест факториала положительного числа 7")
    void testFactorialPos() {
        long result = Factorial.factorial(7);
        Assert.assertEquals(result, 5040L);
        System.out.println("Результат: 7! = " + result);
    }

    @Test(description = "Тест факториала отрицательного числа -7",
            expectedExceptions = IllegalArgumentException.class)
    void testFactorialNeg() {
        Factorial.factorial(-7);
    }

    @Test(description = "Тест площади треугольника со сторонами 3, 4, 5")
    void testTriangleArea() {
        Assert.assertEquals(TriangleArea.getArea(3, 4, 5), 6.0, 0.001);
        System.out.println("Результат: Площадь треугольника 6.0");
    }

    @Test(description = "Тест площади треугольника с отрицательной стороной",
            expectedExceptions = IllegalArgumentException.class)
    void testTriangleAreaNeg() {
        TriangleArea.getArea(-3, 4, 5);
    }

    @Test(description = "Тест сложения: 10 + 5")
    void testAddition() {
        double result = ArithOperations.calculator(10, 5, '+');
        Assert.assertEquals(result, 15.0);
        System.out.println("Результат сложения: " + result);
    }

    @Test(description = "Тест вычитания: 10 - 5")
    void testSubtraction() {
        double result = ArithOperations.calculator(10, 5, '-');
        Assert.assertEquals(result, 5.0);
        System.out.println("Результат вычитания: " + result);
    }

    @Test(description = "Тест умножения: 10 * 5")
    void testMultiplication() {
        double result = ArithOperations.calculator(10, 5, '*');
        Assert.assertEquals(result, 50.0);
        System.out.println("Результат умножения: " + result);
    }

    @Test(description = "Тест деления: 10 / 5")
    void testDivision() {
        double result = ArithOperations.calculator(10, 5, '/');
        Assert.assertEquals(result, 2.0);
        System.out.println("Результат деления: " + result);
    }

    @Test(description = "Тест деления на ноль",
            expectedExceptions = ArithmeticException.class)
    void testDivisionByZero() {
        ArithOperations.calculator(10, 0, '/');
    }

    @Test(description = "Тест неверной операции",
            expectedExceptions = IllegalArgumentException.class)
    void testInvalidOperation() {
        ArithOperations.calculator(10, 5, '?');
    }

    @Test(description = "Сравнение чисел: первое число больше")
    void testCompareGreater() {
        String result = IntCompare.compare(10, 5);
        Assert.assertEquals(result, "a > b");
        System.out.println("Результат: " + result);
    }

    @Test(description = "Сравнение чисел: первое число меньше")
    void testCompareLess() {
        String result = IntCompare.compare(3, 7);
        Assert.assertEquals(result, "a < b");
        System.out.println("Результат: " + result);
    }

    @Test(description = "Сравнение чисел: числа равны")
    void testCompareEqual() {
        String result = IntCompare.compare(7, 7);
        Assert.assertEquals(result, "a == b");
        System.out.println("Результат: " + result);
    }
}