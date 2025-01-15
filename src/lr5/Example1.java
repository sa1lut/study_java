package lr5;

public class Example1 {
    public static class ClassExample1 {
        // Закрытое символьное поле
        private char character;

        // Метод, присваивающий значение полю
        public void setCharacter(char character) {
            this.character = character;
        }

        // Метод, возвращающий код символа
        public int getCharacterCode() {
            return (int) character;
        }

        // Метод, выводящий символ и его код в консоль
        public void printCharacterAndCode() {
            System.out.println("Символ = " + character + ", Код = " + getCharacterCode());
        }
    }

    public static void main(String[] args) {
        ClassExample1 classExample = new ClassExample1();
        classExample.setCharacter('S');
        classExample.printCharacterAndCode();
    }
}
