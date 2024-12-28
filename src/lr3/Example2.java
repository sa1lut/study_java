package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day_num;

        System.out.print("Пожалуйста введите название дня недели: ");
        String day = scanner.nextLine();

        switch (day.toLowerCase()) {
            case "понедельник":
                day_num = 1;
                break;
            case "вторник":
                day_num = 2;
                break;
            case "среда":
                day_num = 3;
                break;
            case "четверг":
                day_num = 4;
                break;
            case "пятница":
                day_num = 5;
                break;
            case "суббота":
                day_num = 6;
                break;
            case "воскресенье":
                day_num = 7;
                break;
            default:
                System.out.println("Такого дня не существует.");
                return;
        }

        System.out.println(day + " это " + day_num + " день недели");
    }
}
