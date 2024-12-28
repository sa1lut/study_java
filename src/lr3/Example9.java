package lr3;

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        int size = 10;
        int[] numbers = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.print("Случайно сгенерированый массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int min = numbers[0];
        int[] indexes = new int[size];
        int count = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                count = 0;
            }

            if (numbers[i] == min) {
                indexes[count] = i;
                count++;
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.print("Индекс значения: ");
        for (int i = 0; i < count; i++) {
            System.out.print(indexes[i] + " ");
        }
    }
}
