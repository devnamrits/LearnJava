package Generics;

public class GenericsRunner {
    public static void main(String[] args){
        MyCustomList<String> list1 = new MyCustomList<>();
        list1.addElement("Element 1");
        list1.addElement("Element 2");
        String value = list1.get(0);
        System.out.println(list1);
        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(2));
        list2.addElement(Integer.valueOf(3));
        Integer number = list2.get(0);
        System.out.println(list2);
        System.out.println(number);
    }
}
