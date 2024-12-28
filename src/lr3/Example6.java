package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        try {
            System.out.print("Введите размер массива: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным числом");
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод, размер массива должен быть целым положительным числом");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        int[] numbers = new int[size];
        int value = 2;
        for (int i = 0; i < size; i++) {
            numbers[i] = value;
            value += 5;
        }

        System.out.println("Массив с числами которые при делении на 5 дают 2 в остатке:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
