package lr6;

import java.util.Arrays;

public class Example7 {
    public static class ClassExample7 {
        // Статический метод для преобразования символьного массива в массив кодов символов
        public static int[] convertCharArrayToIntArray(char[] charArray) {
            if (charArray == null) {
                throw new IllegalArgumentException("Ошибка: массив не должен быть null.");
            }

            int[] intArray = new int[charArray.length];

            for (int i = 0; i < charArray.length; i++) {
                intArray[i] = (int) charArray[i];
            }

            return intArray;
        }
    }

    public static void main(String[] args) {
        char[] charArray = {'С', 'а', 'л', 'т', 'а', 'н', 'о', 'в'};

        // Преобразование символьного массива в массив кодов символов
        int[] resultArray = ClassExample7.convertCharArrayToIntArray(charArray);
        System.out.println("Массив кодов символов: " + Arrays.toString(resultArray));
    }
}
