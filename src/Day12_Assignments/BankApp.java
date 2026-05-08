package Day12_Assignments;
import java.io.*;
import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            File file = new File("account.txt");

            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

            System.out.println("\nEnter Account Details-");

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Current Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Transaction Type (Deposit/Withdraw): ");
            String transaction = sc.nextLine();

            System.out.print("Enter Transaction Amount: ");
            double amount = sc.nextDouble();

            double oldBalance = balance;

            if (transaction.equalsIgnoreCase("Deposit")) {
                balance = balance + amount;
            } else if (transaction.equalsIgnoreCase("Withdraw")) {
                balance = balance - amount;
            }

            PrintWriter pw = new PrintWriter(new FileWriter(file));

            pw.println("Customer Account Details -");
            pw.println("Account Number      : " + accNo);
            pw.println("Customer Name       : " + name);
            pw.println("Old Balance         : " + oldBalance);
            pw.println("Transaction Type    : " + transaction);
            pw.println("Transaction Amount  : " + amount);
            pw.println("Updated Balance     : " + balance);

            pw.close();

            System.out.println("\nAccount Details Saved Successfully");

            BufferedReader br =new BufferedReader(new FileReader(file));

            String line;

            System.out.println("\nAccount Details -\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}