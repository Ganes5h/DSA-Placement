import java.util.Scanner;

public class Bigger_among_three_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > b) {
            System.out.println("Greter is " + a);
        } else if (b > a && b > c) {
            System.out.println("Greter is " + b);
        } else {
            System.out.println("Greter is " + c);
        }

    }
}
