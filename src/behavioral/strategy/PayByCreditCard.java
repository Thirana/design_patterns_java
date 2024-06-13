package behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// concrete class for PayByCreditCard pay strategy
public class PayByCreditCard implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    // if we want we can simulate a credit card details data base like PayByPalPay strategy

    // collect credit card data
    @Override
    public void collectPaymentDetails(){
        try{
            System.out.println("Enter card number: ");
            String number = READER.readLine();

            System.out.println("Enter card expiration date 'mm/yy': ");
            String date = READER.readLine();

            System.out.println("Enter card cvv code: ");
            String cvv = READER.readLine();

            card = new CreditCard(number, date, cvv);

            // if we want we can add credit card validation rules like PayByPayPal strategy
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }


    private boolean cardIsPresent(){

        // additional complet logics can be added later
        return card != null;
    }

    // payment process
    @Override
    public boolean pay(int paymentAmount){
        if(cardIsPresent()){
            System.out.println("Paying " + paymentAmount + " using credit card");
            card.setAmount(card.getAmount() - paymentAmount);
            System.out.println("Remaing balance: " + card.getAmount());
            return true;
        }
        else{
            return false;
        }
    }

}
