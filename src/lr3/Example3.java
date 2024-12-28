package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел Фибоначчи для генерации: ");
        int len = scanner.nextInt();
        scanner.close();

        int first = 1, second = 1, sum = 0, i = 2;
        System.out.println("Первый вариант(for):");
        System.out.print("Последовательность чисел: " + first + ", " + second);

        for (i = 2; i < len; i++) {
            sum = first + second;
            System.out.print(", " + sum);
            first = second;
            second = sum;
        }

        second = first = 1;
        sum = 0;
        System.out.println('\n' + "Второй вариант(while):");
        System.out.print("Последовательность чисел: " + first + ", " + second);
        i = 2;
        while (i < len){
            sum = first + second;
            System.out.print(", " + sum);
            first = second;
            second = sum;
            i++;
        }

        second = first = 1;
        sum = 0;
        System.out.println('\n' + "Третий вариант(do while):");
        System.out.print("Последовательность чисел: " + first + ", " + second);
        i = 2;
        do {
            sum = first + second;
            System.out.print(", " + sum);
            first = second;
            second = sum;
            i++;
        }
        while (i < len);
    }
}
