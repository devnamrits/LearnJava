package FunctionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args){
        List<String> list = List.of("Ram", "Shyam", "Mohan");
        basicPrint(list);
        FPprint(list);
        printWithFPFiltering(list);
    }

    public static void basicPrint(List<String> list){
        for (String string:list){
            System.out.println(string);
        }
    }

    public static void FPprint(List<String> list){
        list.stream().forEach(element -> System.out.println("Print with FP:" + element));
    }

    public static void printWithFPFiltering(List<String> list){
        list.stream()
                .filter(element -> element.endsWith("am"))
                .forEach(element -> System.out.println(element));
    }
}
