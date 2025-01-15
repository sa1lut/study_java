package lr6;

public class Example2 {
    public static class ClassExample2 {
        // Закрытое статическое целочисленное поле с начальным нулевым значением
        private static int number = 0;

        // Статический метод для отображения текущего значения и увеличения на единицу
        public static void displayNumberValueAndIncreaseByOne() {
            System.out.println("Текущее значение number = " + number);
            number = number + 1;
        }
    }

    public static void main(String[] args) {
        // Вызов статического метода несколько раз для демонстрации работы
        ClassExample2.displayNumberValueAndIncreaseByOne();
        ClassExample2.displayNumberValueAndIncreaseByOne();
        ClassExample2.displayNumberValueAndIncreaseByOne();
    }
}
