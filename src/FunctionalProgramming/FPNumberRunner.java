package FunctionalProgramming;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 6, 8, 13, 3, 15);

        int sum = list.stream()
                .reduce(0, (number1, number2) -> number1 + number2);
        System.out.println("Total sum: " + sum);

        int oddSum = list.stream()
                .filter(number -> number % 2 == 1)
                .reduce(0, (number1, number2) -> number1 + number2);
        System.out.println("Sum of Odd numbers: " + oddSum);
    }
}
