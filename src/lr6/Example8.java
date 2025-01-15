package lr6;

public class Example8 {
    public static class ClassExample8 {
        // Статический метод для вычисления среднего значения элементов массива
        public static double calculateAverageOfArrayElements(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Ошибка: массив не должен быть null или пустым.");
            }

            long sum = 0;

            for (int num : array) {
                sum = sum + num;
            }

            return (double) sum / array.length;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 15, 58, 12, 23, 17, 24, 52};

        // Вычисление среднего значения элементов массива
        double average = ClassExample8.calculateAverageOfArrayElements(numbers);
        System.out.println("Среднее значение массива: " + average);
    }
}
