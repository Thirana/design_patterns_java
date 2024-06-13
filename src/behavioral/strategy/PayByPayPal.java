package behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// concrete class for PayPal pay strategy
public class PayByPayPal implements PayStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    // sample data base
    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    // set signedIn status
    public void setSignedInStatus(boolean signedIn){
        this.signedIn = signedIn;
    }

    // return signedIn status
    public boolean verify(){
        setSignedInStatus(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    // collect customer's data
    @Override
    public void collectPaymentDetails(){
        try{
            while(!signedIn){
                System.out.println("Enter user email: ");
                email = READER.readLine();
                System.out.println("Enter password: ");
                password = READER.readLine();

                if(verify()){
                    System.out.println("User credential verification has been succesfull.");
                }
                else{
                    System.out.println("Wrong email or password");
                }
            }
        } 
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

    // process payment
    @Override
    public boolean pay(int paymentAmount){
        if(verify()){
            System.out.println("Paying " + paymentAmount + " from PayPal");
            return true;
        }
        else{
            return false;
        }
    }

}
