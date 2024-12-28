package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел для суммирования: ");
        int count = scanner.nextInt();


        System.out.println("Первый вариант(while):");

        while (counter < count) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                counter++;
                System.out.println("Число №" + counter + ": " + i);
            }
            i++;
        }

        System.out.println("Сумма чисел равна " + sum);

        sum = 0;
        counter = 0;
        System.out.println("Второй вариант(for):");

        for (i = 0; ;i++){
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                counter++;
                System.out.println("Число №" + counter + ": " + i);
            }
            if(counter == count){
                break;
            }
        }

        System.out.println("Сумма чисел равна " + sum);

        sum = 0;
        counter = 0;
        i = 1;
        System.out.println("Третий вариант(do while):");
        do {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                counter++;
                System.out.println("Число №" + counter + ": " + i);
            }
            i++;
        }
        while (counter < count);

        System.out.println("Сумма чисел равна " + sum);

        scanner.close();
    }
}
