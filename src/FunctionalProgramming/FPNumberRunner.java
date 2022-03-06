package FunctionalProgramming;

import java.util.List;

/*
 * Two important things in Functional Programming:
 *   # Avoid mutation, usage of local variables etc.
 *   # We just need to tell what exactly we have to do. For example we just telling to pick the stream of numbers
 *     and add it up
 * */

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
