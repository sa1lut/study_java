package lr7;

public class Examle2 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Это супер класс");
        System.out.println("Текст суперкласса: " + superClass.getTextField());
        System.out.println("Количество символов в строке суперкласса : " + superClass.getTextLength());

        SubClass subClass = new SubClass(10, "Это подкласс");
        System.out.println("Текст подкласса: " + subClass.getTextField());
        System.out.println("Число покласса: " + subClass.getIntField());
        System.out.println("Количество символов в строке : " + subClass.getTextLength());

        subClass.setTextField();
        System.out.println("подкласс после установки : " + subClass.getTextField());

        subClass.setTextField("Следующий текст");
        System.out.println("Подкласс после setTextField(\"новый текст\"): " + subClass.getTextField());

        subClass.setTextField(20);
        System.out.println("Число подкласса после setTextField(20): " + subClass.getIntField());

        subClass.setTextField("другой текст", 30);
        System.out.println("Текста подкласса после setTextField(\"другой текст\", 30): " + subClass.getTextField());
        System.out.println("Число подкласс после setTextField(\"другой текст\", 30): " + subClass.getIntField());
    }

    public static class SuperClass {

        private String textField;

        public SuperClass(String textField) {
            this.textField = textField;
        }

        public void setTextField(String textField) {
            this.textField = textField;
        }

        public int getTextLength() {//получение количества символов строки
            return textField != null ? textField.length() : 0;
        }

        public String getTextField() {//возвращает текстовое поле
            return textField;
        }
    }

    public static class SubClass extends SuperClass {//подкласс

        public int intField;

        public SubClass(int intField, String textField) {
            super(textField);
            this.intField = intField;
        }

        // Перегрузка методов setTextField

        public void setTextField() {
            super.setTextField("Обычное значение");
        }

        public void setTextField(String textField) {
            super.setTextField(textField);
        }

        public void setTextField(int intField) {
            this.intField = intField;
        }

        public void setTextField(String textField, int intField) {
            super.setTextField(textField);
            this.intField = intField;
        }

        public int getIntField() {
            return intField;
        }
    }
}
