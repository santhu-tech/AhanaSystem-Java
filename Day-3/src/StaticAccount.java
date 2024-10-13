public class StaticAccount {
    static double interestRate=4.5; //static variable
    double balance;

    public StaticAccount(double balance) {
        this.balance = balance;
    }

   static void changeInterestRate(double newRate){ //static method
        interestRate=newRate;
   }
   void displayDetails(){
       System.out.println("Balance:" +balance);
       System.out.println("InterestRate:" +interestRate);
   }

    public static void main(String[] args) {
        StaticAccount.changeInterestRate(5.0);
        StaticAccount s1=new StaticAccount(1000);
        StaticAccount s2=new StaticAccount(3000);

        s1.displayDetails();
        s2.displayDetails();



    }
}
