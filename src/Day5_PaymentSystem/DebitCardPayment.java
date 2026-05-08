package Day5_PaymentSystem;
class DebitCardPayment implements _Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Debit Card payment...");
    }
}
