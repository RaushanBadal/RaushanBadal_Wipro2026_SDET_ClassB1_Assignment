package Day2_assignments;
import java.util.*;
public class ATMMenu {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int choice;
	    int balance = 10000;

	    do {
	       System.out.println("\n1. Check Balance");
	       System.out.println("2. Withdraw");
	       System.out.println("3. Exit");
	       System.out.print("Enter choice: ");

	       choice = sc.nextInt();

	       switch (choice) {
	           case 1:
	              System.out.println("Balance: " + balance);
	              break;

	       case 2:
	       System.out.print("Enter amount: ");
	       int amount = sc.nextInt();

	       if (amount <= balance) {
	             balance -= amount;
	             System.out.println("Withdrawal Successful");
	             } else {
	             System.out.println("Insufficient Balance");
	             }
	             break;

	        case 3:
	             System.out.println("Thank you!");
	             break;

	             default:
	             System.out.println("Invalid choice");
	            }

	        } while (choice != 3);

	        sc.close();
	    }
	}
