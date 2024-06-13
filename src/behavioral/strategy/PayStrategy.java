package behavioral.strategy;

// common interface for all the concrete pay strategies
public interface PayStrategy {

    boolean pay(int PaymentAmount);
    void collectPaymentDetails();
}
