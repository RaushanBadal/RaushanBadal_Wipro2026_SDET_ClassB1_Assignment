package Day12_Assignments;
import java.io.*;
import java.util.Scanner;

public class FoodDeliveryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            File file = new File("foodorder.txt");

            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

            System.out.println("\n===== Food Delivery Application =====");

            System.out.print("Enter Customer Name: ");
            String customer = sc.nextLine();

            System.out.print("Enter Restaurant Name: ");
            String restaurant = sc.nextLine();

            System.out.print("Enter Food Item: ");
            String food = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Delivery Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Delivery Status: ");
            String status = sc.nextLine();

            PrintWriter pw = new PrintWriter(
                    new FileWriter(file));

            pw.println("===== Food Order Details =====");
            pw.println("Customer Name     : " + customer);
            pw.println("Restaurant Name   : " + restaurant);
            pw.println("Food Item         : " + food);
            pw.println("Quantity          : " + quantity);
            pw.println("Delivery Address  : " + address);
            pw.println("Delivery Status   : " + status);

            pw.close();

            System.out.println("\nFood Order Saved Successfully");

            BufferedReader br =
                    new BufferedReader(
                    new FileReader(file));

            String line;

            System.out.println("\n===== Saved Food Order Details =====\n");

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