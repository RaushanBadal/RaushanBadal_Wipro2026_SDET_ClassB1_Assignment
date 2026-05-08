package Day2_assignments;
import java.util.*;
public class password {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String correctPassword = "1234";
	        int attempts = 3;

	        while (attempts > 0) {
	            System.out.print("Enter password: ");
	            String input = sc.next();

	            if (input.equals(correctPassword)) {
	                System.out.println("Login Successful");
	                break;
	            } else {
	                attempts--;
	                System.out.println("Wrong Password");
	            }
	        }

	        if (attempts == 0) {
	            System.out.println("Account Locked");
	        }

	        sc.close();
	    }
	}
