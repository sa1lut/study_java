package lr7;

public class Examle4 {
    public static void main(String[] args) {
        // Создание объектов с помощью обычных конструкторов
        SuperClass superClass = new SuperClass('A');
        SubClass1 subClass1 = new SubClass1('Б', "Привет");
        SubClass2 subClass2 = new SubClass2('В', "Мир!", 10);

        System.out.println("Первоначальные объекты:");
        System.out.println(superClass);
        System.out.println(subClass1);
        System.out.println(subClass2);

        // Создание копий с помощью конструкторов копирования
        SuperClass superClassCopy = new SuperClass(superClass);
        SubClass1 subClass1Copy = new SubClass1(subClass1);
        SubClass2 subClass2Copy = new SubClass2(subClass2);

        System.out.println("\n Скопированные объекты");
        System.out.println(superClassCopy);
        System.out.println(subClass1Copy);
        System.out.println(subClass2Copy);

        // Изменение оригинальных объектов
        superClass.charField = 'X';
        subClass1.stringField = "Новый текст";
        subClass2.intField = 20;

        System.out.println("\n Измененный начальный текст");
        System.out.println(superClass);
        System.out.println(subClass1);
        System.out.println(subClass2);

        System.out.println("\nСкопированные объекты после изменения:");
        System.out.println(superClassCopy);
        System.out.println(subClass1Copy);
        System.out.println(subClass2Copy);
    }


    public static class SuperClass {
        public char charField;

        public SuperClass(char charField) {
            this.charField = charField;
        }

        // Конструктор копирования
        public SuperClass(SuperClass other) {
            this.charField = other.charField;
        }

        @Override
        public String toString() {
            return "SuperClass{" +
                    "charField=" + charField +
                    '}';
        }
    }

    public static class SubClass1 extends SuperClass {
        public String stringField;

        public SubClass1(char charField, String stringField) {
            super(charField);
            this.stringField = stringField;
        }

        // Конструктор копирования
        public SubClass1(SubClass1 other) {
            super(other); // Вызываем конструктор копирования суперкласса
            this.stringField = other.stringField;
        }

        @Override
        public String toString() {
            return "SubClass1{" +
                    "charField=" + charField +
                    ", stringField='" + stringField + '\'' +
                    '}';
        }
    }

    public static class SubClass2 extends SubClass1 {
        public int intField;

        public SubClass2(char charField, String stringField, int intField) {
            super(charField, stringField);
            this.intField = intField;
        }

        // Конструктор копирования
        public SubClass2(SubClass2 other) {
            super(other); // Вызываем конструктор копирования суперкласса
            this.intField = other.intField;
        }

        @Override
        public String toString() {
            return "SubClass2{" +
                    "charField=" + charField +
                    ", stringField='" + stringField + '\'' +
                    ", intField=" + intField +
                    '}';
        }
    }
}
