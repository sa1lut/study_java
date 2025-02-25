package lr7;

public class Examle1 {
    public static void main(String[] args){
        SuperClass superClass = new SuperClass("Это супер класс");
        System.out.println(superClass);

        SubClass subClass1 = new SubClass("Это наследуемая часть супер класса"); //не передаём свой аргумент
        System.out.println(subClass1);

        SubClass subClass2 = new SubClass("Это наследуемая часть супер класса", "Это подкласс");
        System.out.println(subClass2);
    }
    public static class SuperClass{

        private String firstTextField;

        public SuperClass(String firstTextField){
            this.firstTextField = firstTextField;
        }

        public String getFirstTextField(){
            return firstTextField;
        }

        @Override
        public String toString(){
            return "SuperClass{" + "firstTextField=" + firstTextField + '\''+'}';
        }
    }

    public static class SubClass extends SuperClass{
        private String secondTextField;
        public SubClass(String firstTextField){
            super(firstTextField);
        }

        public SubClass(String firstTextField, String secondTextField){
            super(firstTextField);
            this.secondTextField = secondTextField;
        }

        public String getSecongTextField(){
            return secondTextField;
        }

        @Override
        public String toString(){
            return "SubClass{" + "firstTextField=" + getFirstTextField()+'\'' + ", secondTextField=" + secondTextField + '\'' + '}';
        }


    }
}
