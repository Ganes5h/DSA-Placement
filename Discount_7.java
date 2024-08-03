import java.util.Scanner;

public class Discount_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your amount : ");
        float amt = sc.nextInt();
        if (amt < 6000) {
            System.out.println("No disccount on your amount : ");
        } else {
            System.out.println("You will be getting 10% disccount on amt " + amt);
            float disccount = (amt * 10) / 100;
            System.out.println(
                    "Disccount is : " + disccount + " Your total bill after disccount is rs : " + (amt - disccount));
        }
    }
}
