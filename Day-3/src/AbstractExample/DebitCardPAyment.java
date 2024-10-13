package AbstractExample;

import java.sql.SQLOutput;

public class DebitCardPAyment extends Ecommerce {
    @Override
    public void validatePayment() {

        System.out.println("I am using Debit card");

    }
}

