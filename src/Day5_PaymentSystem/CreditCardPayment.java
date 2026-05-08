package Day5_PaymentSystem;
class CreditCardPayment implements _Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment...");
    }
}
