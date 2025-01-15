package lr5;

public class Example3 {
    public static class ClassExample3 {
        // Первое целочисленное поле
        public int firstNumber;

        // Второе целочисленное поле
        public int secondNumber;

        // Конструктор без аргументов
        public ClassExample3() {
            this.firstNumber = 0;
            this.secondNumber = 0;
        }

        // Конструктор с одним аргументом
        public ClassExample3(int number) {
            this.firstNumber = number;
            this.secondNumber = 0;
        }

        // Конструктор с двумя аргументами
        public ClassExample3(int firstNumber, int secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }
    }

    public static void main(String[] args) {
        ClassExample3 obj1 = new ClassExample3();
        System.out.println("Объект1: Первое число = " + obj1.firstNumber + ", второе число = " + obj1.secondNumber);

        ClassExample3 obj2 = new ClassExample3(7);
        System.out.println("Объект2: Первое число = " + obj2.firstNumber + ", второе число = " + obj2.secondNumber);

        ClassExample3 obj3 = new ClassExample3(4, 12);
        System.out.println("Объект3: Первое число = " + obj3.firstNumber + ", второе число = " + obj3.secondNumber);
    }
}
