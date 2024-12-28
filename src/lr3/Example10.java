package lr3;

import java.util.Arrays;
import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.println("Изаначальный случайно сгенерированый массив: " + Arrays.toString(array));

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int new_array = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = new_array;
        }

        System.out.println("Массив отсортированный в убывающем порядке: " + Arrays.toString(array));
    }
}
