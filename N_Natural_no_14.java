import java.util.Scanner;

public class N_Natural_no_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N : ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(i + "\t");
        }
    }
}
