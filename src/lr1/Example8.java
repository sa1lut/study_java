package lr1;

import java.util.Scanner;

public class Example8 {
    // Напишите программу, в которой Пользователь последовательно вводит
    // название текущего дня недели, название месяца и дату (номер дня в месяце).
    // Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название текущего дня недели: ");
        String dayOfWeek = scanner.nextLine();

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.print("Введите номер дня в месяце: ");
        int date = scanner.nextInt();

        System.out.printf("Сегодня: " + dayOfWeek + " " + date + " " + month);

        scanner.close();
    }
}