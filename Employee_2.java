import java.util.Scanner;

public class Employee_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee No. : ");
        int a = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter Employee Name : ");
        String name = sc.nextLine();
        
        System.out.println("Enter Employee Monthly salary : ");
        float salaryMonthly = sc.nextFloat();
        
        System.out.println(name + " Yearly salary is : " + (salaryMonthly * 12));
    }
}
