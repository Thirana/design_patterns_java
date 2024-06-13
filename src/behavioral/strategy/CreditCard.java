package behavioral.strategy;

// blueprint for credit card
// this class is used in the PayByCreditCard class (concrete payment strategy)
public class CreditCard {

    private int amount;
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number, String date, String cvv){
        this.amount = 100000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount (int amount){
        this.amount = amount;
    }

    public int getAmount (){
        return amount;
    }

}
