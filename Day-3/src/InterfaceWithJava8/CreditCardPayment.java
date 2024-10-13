package InterfaceWithJava8;

public class CreditCardPayment implements PaymentGateWay{
    @Override
    public void processPayment(double amount, String paymentType) {

    }

    @Override
    public void generateReceipt(double amount, String paymentType) {
        PaymentGateWay.super.generateReceipt(amount, paymentType);
    }

    public void procssPayment(){

    }

}
