import java.util.Scanner;

public class Positive_result_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float result = a - b;
        System.out.println("Difference is : " + Math.abs(result));
    }
}
