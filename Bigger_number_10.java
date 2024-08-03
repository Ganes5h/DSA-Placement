import java.util.Scanner;

public class Bigger_number_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(" Greter number is : " + a);
        } else {
            System.out.println(" Greter number is : " + b);
        }
    }
}
