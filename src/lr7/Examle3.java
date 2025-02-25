package lr7;

public class Examle3 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(5);
        System.out.println(superClass);

        SubClass1 subClass1 = new SubClass1(17, 'А');
        System.out.println(subClass1);

        SubClass2 subClass2 = new SubClass2(34, 'Б', "Привет");
        System.out.println(subClass2);

        subClass2.setFields(68, 'В', "Мир!");
        System.out.println(subClass2);
    }

    public static class SuperClass {
        public int intField;

        public SuperClass(int intField) {
            this.intField = intField;
        }

        public void setFields(int intField) {
            this.intField = intField;
        }

        @Override
        public String toString() {
            return "SuperClass{" +
                    "intField=" + intField +
                    '}';
        }
    }

    public static class SubClass1 extends SuperClass {
        public char charField;

        public SubClass1(int intField, char charField) {
            super(intField);
            this.charField = charField;
        }

        public void setFields(int intField, char charField) {
            super.setFields(intField);
            this.charField = charField;
        }

        @Override
        public String toString() {
            return "SubClass1{" +
                    "intField=" + intField +
                    ", charField=" + charField +
                    '}';
        }
    }

    public static class SubClass2 extends SubClass1 {
        public String stringField;

        public SubClass2(int intField, char charField, String stringField) {
            super(intField, charField);
            this.stringField = stringField;
        }

        public void setFields(int intField, char charField, String stringField) {
            super.setFields(intField, charField);
            this.stringField = stringField;
        }

        @Override
        public String toString() {
            return "SubClass2{" +
                    "intField=" + intField +
                    ", charField=" + charField +
                    ", stringField='" + stringField + '\'' +
                    '}';
        }
    }
}
