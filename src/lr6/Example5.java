package lr6;

public class Example5 {
    public static class ClassExample5 {
        // Метод для проверки корректности входного значения
        private static void validateNaturalNumber(int n) {
            if (n < 1) {
                throw new IllegalArgumentException("Ошибка: число должно быть натуральным.");
            }
        }

        // Статический метод для вычисления суммы квадратов натуральных чисел
        public static long calculateSumOfSquares(int n) {
            validateNaturalNumber(n);
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + (long) i * i; // Суммируем квадраты чисел
            }
            return sum;
        }

        // Статический метод для проверки результата с использованием формулы
        public static long calculateSumOfSquaresByFormula(int n) {
            validateNaturalNumber(n);
            return (long) n * (n + 1) * (2 * n + 1) / 6;
        }
    }

    public static void main(String[] args) {
        int number = 10;

        // Вычисление суммы квадратов натуральных чисел с помощью цикла
        long sumOfSquares = ClassExample5.calculateSumOfSquares(number);
        System.out.println("Сумма квадратов чисел до " + number + " = " + sumOfSquares);

        // Вычисление суммы квадратов с использованием формулы
        long sumByFormula = ClassExample5.calculateSumOfSquaresByFormula(number);
        System.out.println("Сумма квадратов чисел до " + number + " (по формуле) = " + sumByFormula);
    }
}
