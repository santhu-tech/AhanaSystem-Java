public class DemoStaticFinal {
    //ginal variable ,final method ,final class all allowed
    final double MINIMUM_BAL=100.0;  //final varaible
    double balance;

    public DemoStaticFinal(double balance) {
        this.balance = balance;
    }

    final void display(){
        System.out.println("Minimum balance:" +MINIMUM_BAL);
    }

    public static void main(String[] args) {
        DemoStaticFinal dsf=new DemoStaticFinal(200);
        dsf.display();
    }

}

//final class FixedDeposit(){  //Cannot be subclassed
//
//}
