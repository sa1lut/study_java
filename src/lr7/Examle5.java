package lr7;

public class Examle5 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Супер класс");
        SubClass1 subClass1 = new SubClass1("Первый подкласс", 12);
        SubClass2 subClass2 = new SubClass2("Второй подкласс", 'Р');

        System.out.println("Вывод действующей информации:");
        superClass.displayInfo();
        subClass1.displayInfo();
        subClass2.displayInfo();

        System.out.println("\nВызов displayInfo() через переменную SuperClass");
        SuperClass ref1 = subClass1;
        ref1.displayInfo(); // Вызовется переопределенный метод из SubClass1

        SuperClass ref2 = subClass2;
        ref2.displayInfo(); // Вызовется переопределенный метод из SubClass2
    }

    public static class SuperClass {
        private String textField;

        public SuperClass(String textField) {
            this.textField = textField;
        }

        public void displayInfo() {
            System.out.println("Class: SuperClass, textField: " + textField);
        }

        public String getTextField() {
            return textField;
        }
    }

    public static class SubClass1 extends SuperClass {
        protected int intField;

        public SubClass1(String textField, int intField) {
            super(textField);
            this.intField = intField;
        }

        @Override
        public void displayInfo() {
            System.out.println("Class: SubClass1, textField: " + getTextField() + ", intField: " + intField);
        }
    }

    public static class SubClass2 extends SuperClass {
        protected char charField;

        public SubClass2(String textField, char charField) {
            super(textField);
            this.charField = charField;
        }

        @Override
        public void displayInfo() {
            System.out.println("Class: SubClass2, textField: " + getTextField() + ", charField: " + charField);
        }
    }
}
