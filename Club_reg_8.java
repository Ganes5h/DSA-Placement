import java.util.*;
public class Club_reg_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your mobile number: ");
        String mobileNumber = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Congratulations, " + name + "!");
            System.out.println("You have successfully registered for the Sports Club.");
            System.out.println("Details:");
            System.out.println("Name: " + name);
            System.out.println("Mobile Number: " + mobileNumber);
            System.out.println("Age: " + age);
        } else {
            System.out.println("Sorry! You need to be at least 18 years old to get membership.");
        }

        sc.close();

    }

}
