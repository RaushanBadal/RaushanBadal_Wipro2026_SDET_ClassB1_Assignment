package Day5_PaymentSystem;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" PAYMENT SYSTEM ");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. Cash");

        System.out.print("Choose payment method: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        _Payment payment = null;
        String methodName = "";

        switch (choice) {

            case 1:
                // Lambda for UPI
                payment = (amt) -> {
                    System.out.println("Processing UPI payment...");
                };
                methodName = "UPI";
                break;

            case 2:
                payment = new CreditCardPayment();
                methodName = "Credit Card";
                break;

            case 3:
                payment = new DebitCardPayment();
                methodName = "Debit Card";
                break;

            case 4:
                payment = new CashPayment();
                methodName = "Cash";
                break;

            default:
                System.out.println(" Invalid choice!");
                System.exit(0);
        }

        
        if (payment.validate(amount)) {
            payment.pay(amount);
            payment.printReceipt(amount, methodName);
        }

        sc.close();
    }
}
