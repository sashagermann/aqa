package lesson_5;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] array2 = {
                {"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"},
        };

        try {
            System.out.println("Сумма элементов: " + sumArray(array1));
            String error = array1[5][5];
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Попытка обратиться к несуществующему индексу");
        }
    }

    static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int size = 4;

        if (array.length != size) {
            throw new MyArraySizeException("Массив должен иметь " + size + " строки.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != size) {
                throw new MyArraySizeException("Массив должен иметь " + size + " столбцов.");
            }

            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}

