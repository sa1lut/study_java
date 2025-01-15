package lr6;

import java.util.Arrays;

public class Example9 {
    public static class ClassExample9 {
        // Статический метод для попарной перестановки элементов символьного массива
        public static char[] swapCharArrayElements(char[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Ошибка: массив не должен быть null или пустым.");
            }

            int length = array.length;

            for (int i = 0; i < length / 2; i++) {
                int leftIndex = i;
                int rightIndex = (length - 1) - i;
                char leftCharElement = array[leftIndex];
                char rightCharElement = array[rightIndex];

                array[leftIndex] = rightCharElement;
                array[rightIndex] = leftCharElement;
            }

            return array;
        }
    }

    public static void main(String[] args) {
        char[] charArray = {'С', 'а','л','т','а','н','о','в',' ', 'А','л','е','к','с','а','н','д','р'};

        // Попарная перестановка элементов массива
        char[] swappedArray = ClassExample9.swapCharArrayElements(charArray);
        System.out.println("Массив после перестановки: " + Arrays.toString(swappedArray));
    }
}
