import java.util.Scanner;

public class trywithresource {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in){  //Try with resoucre ..AutoClosable interface 
            System.out.println("Enter the age:");
            int age=scanner.nextInt();
            try{

            }
            catch{

            }

        }
        catch{

        }
        scanner.close();
    }


}
