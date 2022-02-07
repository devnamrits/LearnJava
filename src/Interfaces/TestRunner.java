package Interfaces;

public class TestRunner {
    interface Interface1{
        default void nothing(){
            System.out.println("Interface1");
        }
        void print();
    }

    static class Test1 implements Interface1 {
        @Override
        public void print() {
            System.out.println("Test1");
        }
    }

    static class Test2 implements Interface1{
        @Override
        public void print(){
            System.out.println("Test2");
        }
    }

    public static void main(String[] args){
        Test1 test1 = new Test1();
        test1.print();
        test1.nothing();
        Test2 test2 = new Test2();
        test2.print();
        test2.nothing();
    }
}
