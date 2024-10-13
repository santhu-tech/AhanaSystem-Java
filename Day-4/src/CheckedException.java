import java.io.File;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {

        try {
            File file=new File("sample.txt");
            Scanner sc=new Scanner(file);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Dividing the number by zero is not a valid" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Thanks for visiting again ");
        }

    }
}
