import java.util.Scanner;

public class Negative_Conversion_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("The number is positive : " + a);
        } else if (a == 0) {
            System.out.println("The number is Zero : " + a);
        } else {
            System.out.println("The number is negative :" + a);
            System.out.println( "Negative number converted to positive and now the new positive number is : " + Math.abs(a));
        }
    }
}
