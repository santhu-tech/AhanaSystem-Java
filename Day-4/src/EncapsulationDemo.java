public class EncapsulationDemo {
    //Data Hiding,Improve Security ,Flexibile

    //How to achieve Encapusulation -->Private Keyword ,Provide Public setter ,getter methods

    //Hidden details
    private String accountNumber;

    private double balance;

    //Constrcutor
    public EncapsulationDemo(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {  //Read
        return accountNumber;
    }

//   public void setAccountNumber(String accountNumber) {  //Write
//        this.accountNumber = accountNumber;
//}

    public double getBalance() {   // hiding the details
        return balance;  //only return the balance ,not allowing you to modifiy
    }

    public void deposit(double amount) {  // (Encapsulation)
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited:" + amount);
        } else
            System.out.println("Incorrect amount");
    }

//setter you can do the validation
    //  public void setBalance(double balance) {

//    }
    //Prinitng purpose
//    @Override
//    public String toString() {
//        return "EncapsulationDemo{" +
//                "accountNumber='" + accountNumber + '\'' +
//                ", balance=" + balance +
//                '}';
//    }

    public static void main (String[]args){
        EncapsulationDemo deposit = new EncapsulationDemo("123456", 1000.0);
        deposit.deposit(500);
        //  deposit.setBalance(2000);
        System.out.println("balance after deposit:" + deposit.getBalance());
        deposit.balance = 45500;
//    System.out.println(deposit.getBalance());
    }
}
