import java.util.Scanner;

public class Interest_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle Amount : ");
        int amount=sc.nextInt();
        System.out.println("Enter Rate of Interest (in %): ");
        float r=sc.nextFloat();
        System.out.println("Enter Number of years : ");
        int t=sc.nextInt();
        System.out.println("The interest on amount "+amount+ " is "+ ((amount*t*r))/100);
    }
}
