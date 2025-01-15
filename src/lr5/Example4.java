package lr5;

public class Example4 {
    public static class ClassExample4 {
        // Символьное поле
        public char character;

        // Целочисленное поле
        public int number;

        // Конструктор с двумя аргументами (целое число и символ)
        public ClassExample4(int number, char character) {
            this.number = number;
            this.character = character;
        }

        // Конструктор с одним аргументом типа double
        public ClassExample4(double value) {
            this.character = (char) ((int) value);  // Целая часть для символа
            this.number = (int) ((value * 100) % 100);  // Дробная часть для целого числа
        }
    }

    public static void main(String[] args) {
        ClassExample4 obj1 = new ClassExample4(65.1267);
        System.out.println("Объект1: символ = " + obj1.character + ", число = " + obj1.number);

        ClassExample4 obj2 = new ClassExample4(25, 'B');
        System.out.println("Объект2: символ = " + obj2.character + ", число = " + obj2.number);
    }
}
