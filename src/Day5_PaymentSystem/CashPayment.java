package Day5_PaymentSystem;
class CashPayment implements _Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Cash payment...");
    }
}
