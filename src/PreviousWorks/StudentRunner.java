package PreviousWorks;

import java.util.Scanner;

public class StudentRunner {
    public static void StudentRunnerMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of PreviousWorks.Student: ");
        String name = scanner.next();

        System.out.println("Enter size of marks list: ");
        int marksListSize = scanner.nextInt();

        int[] marksList = new int[marksListSize];

        System.out.println("Enter the marks: ");
        for(int i=0; i<marksListSize;i++){
            marksList[i] = scanner.nextInt();
        }

        Student student1 = new Student(name, marksList);

        System.out.println(student1.getTotalSumOfMarks());
        System.out.println(student1.getAverageMarks());
        System.out.println(student1.getMaximumMarks());
        System.out.println(student1.getMinimumMarks());

    }
}
