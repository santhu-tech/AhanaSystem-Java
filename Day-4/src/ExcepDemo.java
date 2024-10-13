public class ExcepDemo{

    //Checked Exception   ->During your compile time it will check -->IOException,ClassNotFound Exception
    //Unchecked Exception -->Runtime it will check this exception -->ArrayIndexoutofBoundException,AritmeticException
    //try catch throw throws finally
    //Custom Exception
    //try with resources

    public static void main(String[] args) {
        try{
            int result=divide(10,0);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Dividing the number by zero is not a valid" +e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("all Good ");
        }


    }
    public static int divide(int a,int b) {
        if(b==0){
            throw new ArithmeticException("Dividision by zero");
        }
        return a/b;
    }

    public void withdraw(int a) throws InsufficientFundsException{
        System.out.println("Withdrwal amount");
    }
}


