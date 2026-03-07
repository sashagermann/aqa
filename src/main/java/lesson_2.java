import java.util.Scanner;
import java.util.Arrays;

public class lesson_2 {

    public static void main(String[] args) {

        printThreeWords(); // Задание 1
        checkSumSign(); // Задание 2
        printColor(); // Задание 3
        compareNumbers(); // Задание 4
        sumRange(); // Задание 5
        positiveOrNegative(); // Задание 6
        negativeNumChecker(); // Задание 7
        stringPrintNum(); // Задание 8
        leapYearChecker(); // Задание 9
        arrayNumSwitcher(); // Задание 10
        array100(); // Задание 11
        arrayLower6(); // Задание 12
        matrix3X3(); // Задание 13
        arrayInitialValue(); // Задание 14

    }

    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n"  + "Apple");
    }

    // Задание 2
    public static void checkSumSign() {
        int a = 2;
        int b = -3;
        int sum = a + b;
        if(sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зеленый");
        }
    }

    // Задание 4
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if(a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Задание 5
    public static void sumRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Число 1:");
        int num1 = sc.nextInt();
        System.out.println("Число 2:");
        int num2 = sc.nextInt();
        int sum1 = num1 + num2;
        if (10 <= sum1 && sum1 <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // Задание 6
    public static void positiveOrNegative() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num1 = sc.nextInt();
        if (0 <= num1) {
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательное");
        }
    }

    // Задание 7
    public static void negativeNumChecker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num1 = sc.nextInt();
        if (0 <= num1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    // Задание 8
    public static void stringPrintNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фразу:");
        String string1 = sc.nextLine();
        System.out.println("Введите число:");
        int num1 = sc.nextInt();
        for (int i = 0; i < num1; i++) {
            System.out.println(string1);
        }
    }

    // Задание 9
    public static void leapYearChecker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = sc.nextInt();
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        System.out.println(leapYear);
    }

    // Задание 10
    public static void arrayNumSwitcher() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0)
                array[i] = 1;
            else
                array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    // Задание 11
    public static void array100() {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        System.out.println(Arrays.toString(array2));
    }

    // Задание 12
    public static void arrayLower6() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6)
                array3[i] *= 2;
        }
        System.out.println(Arrays.toString(array3));
    }

    // Задание 13
    public static void matrix3X3() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            matrix[i][i] = 1;
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Задание 14
    public static void arrayInitialValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение len:");
        int len = sc.nextInt();
        System.out.println("Введите значение initialValue:");
        int initialValue = sc.nextInt();
        int[] array4 = new int[len];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = initialValue;
        }
        System.out.println(Arrays.toString(array4));
    }

}