import java.util.Scanner;

public class ShoppingMallDiscount_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the billing amount: ");
        double billingAmount = sc.nextDouble();
        System.out.println("Do you have a membership card? (yes/no): ");
        sc.nextLine();
        String hasMembership = sc.nextLine();
        double discount = 0.0;
        if (hasMembership.equalsIgnoreCase("yes")) {
            discount = billingAmount * 0.10;
        } else {
            discount = billingAmount * 0.03;
        }

        double netAmount = billingAmount - discount;
        System.out.println("Net amount to be paid: " + netAmount);

        sc.close();
    }
}
