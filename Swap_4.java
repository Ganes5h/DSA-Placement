import java.util.Scanner;

public class Swap_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Values before swapping are  : " + a + " and " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values of a and b after swapping is : " + a + " and " + b);
    }
}
