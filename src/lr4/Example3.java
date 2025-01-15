package lr4;

public class Example3 {
    public static void main(String[] args) {
        int rows = 7; // Количество строк
        int columns = 10; // Количество столбцов
        int[][] rectangle = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rectangle[i][j] = 2;
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
