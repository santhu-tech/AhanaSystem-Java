public class BankAccount {

    private String accountNumber; //attribute or Instance variable
    private double balance; //attribute or Instance variable

    //Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance; //this.balance your instance varaible
    }
    //Methods
    public void deposit() {  //Deposit method
        //balance += amount;
        System.out.println("Deposit method");
    }


}
