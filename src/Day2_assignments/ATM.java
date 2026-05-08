package Day2_assignments;
public class ATM {
    public static void main(String[] args) {
        double balance = 10000;
        double amount = 2000;

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
