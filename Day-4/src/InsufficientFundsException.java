//public class InsufficientFundsException extends RuntimeException{
    public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String message){
        super(message);
    }

}
