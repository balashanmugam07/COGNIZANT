public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext payment = new PaymentContext();

        // Credit Card Payment
        payment.setPaymentStrategy(new CreditCardPayment());
        payment.makePayment(2500);

        // PayPal Payment
        payment.setPaymentStrategy(new PayPalPayment());
        payment.makePayment(5000);

    }

}