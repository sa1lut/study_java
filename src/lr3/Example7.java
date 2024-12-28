package lr3;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] array = new char[size];

        char first = 'а';
        for (int i = 0; i < size; i++) {
            array[i] = first;
            first += 2;
        }

        System.out.println("Массив в прямом порядке:");
        for (char letter : array) {
            System.out.print(letter + " ");
        }
        System.out.println();

        System.out.println('\n' + "Массив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
