package lr6;

public class Example1 {
    public static class ClassExample1 {
        // Символьное поле
        private char charField;
        // Текстовое поле
        private String textField;

        // Метод для присваивания значения символьному полю
        public void setValue(char value) {
            this.charField = value;
        }

        // Метод для присваивания значения текстовому полю
        public void setValue(String value) {
            this.textField = value;
        }

        // Метод для обработки символьного массива
        public void setValue(char[] value) {
            if (value.length == 1) {
                this.charField = value[0];
            } else {
                this.textField = new String(value);
            }
        }

        // Метод для отображения текущих значений полей
        public void displayValues() {
            System.out.println("charField = " + charField);
            System.out.println("textField = " + textField + '\n');
        }
    }

    public static void main(String[] args) {
        ClassExample1 obj = new ClassExample1();
        // Присваиваем значение символьному полю
        obj.setValue('A');
        obj.displayValues();
        // Присваиваем значение текстовому полю
        obj.setValue("Салтанов");
        obj.displayValues();
        // Присваиваем значение символьному полю через массив
        obj.setValue(new char[]{'С'});
        obj.displayValues();
        // Присваиваем значение текстовому полю через массив
        obj.setValue(new char[]{'А', 'л', 'е', 'к', 'с', 'а', 'н', 'д', 'р'});
        obj.displayValues();
    }
}
