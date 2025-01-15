package lr6;

import java.util.Arrays;

public class Example6 {
    public static class ClassExample6 {
        // Статический метод для получения части массива
        public static int[] getArrayPart(int[] array, int count) {
            if (array == null) {
                throw new IllegalArgumentException("Ошибка: массив не должен быть null.");
            }

            if (count < 0) {
                throw new IllegalArgumentException("Ошибка: количество элементов не может быть отрицательным.");
            }

            int[] newArray;

            if (count > array.length) {
                newArray = copyArray(array, array.length); // Создаем копию массива
            } else {
                newArray = copyArray(array, count); // Создаем часть массива
            }

            return newArray;
        }

        // Метод для копирования массива
        private static int[] copyArray(int[] array, int count) {
            int[] copy = new int[count];

            for (int i = 0; i < count; i++) {
                copy[i] = array[i];
            }
            return copy;
        }
    }

    public static void main(String[] args) {
        int[] originalArray = {6, 1, 9, 3, 0};

        // Пример с количеством меньше длины массива
        int[] resultArrayLess = ClassExample6.getArrayPart(originalArray, 2);
        System.out.println("Получение части массива (меньше длины). Результат: " + Arrays.toString(resultArrayLess));

        // Пример с количеством равным длине массива
        int[] resultArrayEqual = ClassExample6.getArrayPart(originalArray, 5);
        System.out.println("Получение части массива (равно длине). Результат: " + Arrays.toString(resultArrayEqual));

        // Пример с количеством больше длины массива
        int[] resultArrayMore = ClassExample6.getArrayPart(originalArray, 7);
        System.out.println("Получение полной копии массива (больше длины). Результат: " + Arrays.toString(resultArrayMore));
    }
}
