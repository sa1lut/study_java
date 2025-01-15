package lr4;

public class Example1 {
    public static void main(String[] args) {
        int figure = 10;      // Число строк которое необходимо вывести
        int row;              // Переменная задает число, необходимое для расчета количества строк
        int column;           // Переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int count;            // Переменная необходима для вывода служебного сообщения о количестве символов в строке;

        for (row = 1; row <= figure; row++) {
            System.out.print("Номер строки: " + row + " ");
            count = 0;
            for (column = -5; column < figure; column++) {
                System.out.print("+");
                count = count + 1;
            }
            System.out.println("Количество символов в строке " + count);
        }
    }
}
