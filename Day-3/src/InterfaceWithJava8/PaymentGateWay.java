package InterfaceWithJava8;

public interface PaymentGateWay {
    //Constant field
    String PAYMENT_TYPE_CREDIT_CARD="credit card";  //public static final
    String PAYMENT_TYPE_DEBIT_CARD ="Debit card";




    void processPayment(double amount,String paymentType);  //abstract method

    //Java-8
    default void generateReceipt(double amount,String paymentType) {  //default method
        System.out.println("Receipt:");
        System.out.println("Payment Type" +paymentType);
        System.out.println("Amount:" +amount);

    }

    static boolean validatePaymentDetails(String paymentType){ //Static method
        return paymentType.equals(PAYMENT_TYPE_CREDIT_CARD)||
                paymentType.equals(PAYMENT_TYPE_DEBIT_CARD);

    }

}
