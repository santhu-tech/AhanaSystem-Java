import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:" );
        String name=sc.nextLine(); //Input as a String

        System.out.println("Enter your EmployeeID:");
        int employeeId=sc.nextInt(); //Read input as Integer

        System.out.println("Name: " +name);
        System.out.println("EmployeeID :" +employeeId);
    }
}
