package Day6_ATMProject;
import java.util.Scanner;

public class ATM {

    static class InvalidPinException extends Exception {
        public InvalidPinException(String message) {
            super(message);
        }
    }

    static final int CORRECT_PIN = 1234;
    static final int MAX_ATTEMPTS = 3;

    // PIN validation method
    static void validatePin(int pin) throws InvalidPinException {
        if (pin != CORRECT_PIN) {
            throw new InvalidPinException("Incorrect PIN!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        System.out.println("ATM -");
        System.out.println("Card Inserted");

        try {
            while (attempts < MAX_ATTEMPTS) {

                System.out.print("Enter your PIN: ");
                int enteredPin = sc.nextInt();

                try {
                    validatePin(enteredPin);

                    System.out.println("PIN Verified Successfully");
                    System.out.println("You can proceed with transaction");
                    break;

                } catch (InvalidPinException e) {
                    attempts++;
                    System.out.println("❌ " + e.getMessage());

                    if (attempts == MAX_ATTEMPTS) {
                        System.out.println("Card Blocked due to 3 incorrect attempts");
                    } else {
                        System.out.println("Attempts left: " + (MAX_ATTEMPTS - attempts));
                    }
                }
            }

        } finally {
            System.out.println(" Transaction Logged (finally block executed)");
            sc.close();
        }
    }
}
