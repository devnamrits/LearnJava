package PreviousWorks;

import java.util.Scanner;

public class TwoNumberCalculatorRunner {
    public  static void TwoNumberCalculatorRunnerMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        TwoNumberCalculator twoNumberCalculator = new TwoNumberCalculator(num1,num2);

        System.out.println("Enter operator: ");
        char op = scanner.next().charAt(0);

        if(op == '+')
            System.out.println(twoNumberCalculator.add());
        else  if(op == '*')
            System.out.println(twoNumberCalculator.multiply());
        else  if(op == '-')
            System.out.println(twoNumberCalculator.subtract());
        else if(op == '/')
            System.out.println(twoNumberCalculator.divide());
    }
}
