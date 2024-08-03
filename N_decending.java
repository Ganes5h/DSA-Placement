import java.util.Scanner;

public class N_decending {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("The first " + N + " natural numbers in descending order are:");
        for (int i = N; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
