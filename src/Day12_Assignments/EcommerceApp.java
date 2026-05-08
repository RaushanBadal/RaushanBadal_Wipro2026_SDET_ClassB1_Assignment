package Day12_Assignments;
import java.io.*;
import java.util.Scanner;

public class EcommerceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            File file = new File("orders.txt");

            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

            System.out.println("\nEnter Order Details -");

            System.out.print("Enter Order ID: ");
            int orderId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String product = sc.nextLine();

            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String customer = sc.nextLine();

            System.out.print("Enter Shipping Address: ");
            String address = sc.nextLine();

            PrintWriter pw = new PrintWriter(
                    new FileWriter(file));

            pw.println("Order Details -");
            pw.println("Order ID         : " + orderId);
            pw.println("Product Name     : " + product);
            pw.println("Product Price    : " + price);
            pw.println("Customer Name    : " + customer);
            pw.println("Shipping Address : " + address);

            pw.close();

            System.out.println("\nOrder Saved Successfully");

            BufferedReader br =
                    new BufferedReader(
                    new FileReader(file));

            String line;

            System.out.println("\nSaved Order Details\n");

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
