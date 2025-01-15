package lr5;

public class Example2 {
    public static class ClassExample2 {
        // Первое символьное поле
        public char startChar;

        // Второе символьное поле
        public char endChar;

        // Метод, выводящий символы между startChar и endChar включительно
        public void printCharactersInRange() {
            char from = startChar < endChar ? startChar : endChar;
            char to = startChar > endChar ? startChar : endChar;

            for (char c = from; c <= to; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ClassExample2 classExample = new ClassExample2();
        classExample.startChar = 'A';
        classExample.endChar = 'D';
        classExample.printCharactersInRange();
    }
}
