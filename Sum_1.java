import java.util.Scanner;

public class Sum_1 {
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of a = " + a + " and b = " + b + " is " + (a + b));
    }
}