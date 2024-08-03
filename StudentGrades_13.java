import java.util.Scanner;
import java.util.Scanner;

public class StudentGrades_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accepting marks for three subjects
        System.out.println("Enter the marks for subject 1: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter the marks for subject 2: ");
        int marks2 = sc.nextInt();

        System.out.println("Enter the marks for subject 3: ");
        int marks3 = sc.nextInt();

        // Calculating the sum and average
        int sum = marks1 + marks2 + marks3;
        double average = sum / 3.0;

        // Determining the grade
        String grade;
        if (average < 35) {
            grade = "C";
        } else if (average < 60) {
            grade = "B";
        } else {
            grade = "A";
        }

        // Displaying the results
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average of marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
