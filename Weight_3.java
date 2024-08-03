import java.util.Scanner;

public class Weight_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0, weight = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Person " + (i + 1) + " weight");
            weight = sc.nextFloat();
            sum = sum + weight;
        }
        System.out.println("Sum of weights is : " + sum + " and average is " + (sum / 3));
    }
}
