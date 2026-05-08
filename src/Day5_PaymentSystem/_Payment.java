package Day5_PaymentSystem;
interface _Payment {

    void pay(double amount);

   
    default boolean validate(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid amount");
            return false;
        }
        return true;
    }

    
    default void printReceipt(double amount, String method) {
        System.out.println(" Payment of " + amount + " done using " + method);
    }
}
