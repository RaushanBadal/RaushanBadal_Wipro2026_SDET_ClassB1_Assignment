package Day5_JavaAssignment;



// Q1: FINAL VARIABLE
class BankAccount {
 private final int accountNumber; 
 private String name;
 private double balance;

 
 public BankAccount(int accountNumber, String name, double balance) {
     this.accountNumber = accountNumber;
     this.name = name;
     this.balance = balance;
 }

 public void displayAccount() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Customer Name: " + name);
     System.out.println("Balance: " + balance);
 }
}

//Q2: FINAL METHOD 
class Payment {
 
 public final void processPayment() {
     System.out.println("Processing secure payment...");
 }
}

class UpiPayment extends Payment {
 public void showPaymentType() {
     System.out.println("Payment Mode: UPI");
 }

}

//Q3: FINAL CLASS 
final class SecurityModule {
 public void encryptData() {
     System.out.println("Encrypting data securely...");
  // class AdvancedSecurity extends SecurityModule {}
 }
}




public class FinalKeyword {
 public static void main(String[] args) {

     System.out.println(" Final Variable Example=");
     BankAccount acc = new BankAccount(1001, "Raushan", 5000);
     acc.displayAccount();

     System.out.println("\n Final Method Example=");
     UpiPayment payment = new UpiPayment();
     payment.processPayment();
     payment.showPaymentType();

     System.out.println("\nFinal Class Example=");
     SecurityModule security = new SecurityModule();
     security.encryptData();
 }
}