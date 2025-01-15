package lr6;

public class Example4 {
    public static class ClassExample4 {
        // Статический метод для вычисления двойного факториала числа
        public static long calculateDoubleFactorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Ошибка: число не должно быть отрицательным.");
            }
            long result = 1;
            int currentMultiplier = n;
            while (currentMultiplier > 0) {
                // Умножаем результат на текущий множитель
                result = result * currentMultiplier;
                // Переходим к следующему множителю через одно
                currentMultiplier = currentMultiplier - 2;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        // Вычисления двойного факториала
        int number1 = 5;
        long doubleFactorial1 = ClassExample4.calculateDoubleFactorial(number1);
        System.out.println("Двойной факториал числа " + number1 + " = " + doubleFactorial1);

        int number2 = 7;
        long doubleFactorial2 = ClassExample4.calculateDoubleFactorial(number2);
        System.out.println("Двойной факториал числа " + number2 + " = " + doubleFactorial2);
    }
}
