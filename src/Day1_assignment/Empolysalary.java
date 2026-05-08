package Day1_assignment;
import java.util.Scanner;
public class Empolysalary {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter basic salary: ");
		        double basic = sc.nextDouble();

		        System.out.print("Enter bonus: ");
		        double bonus = sc.nextDouble();

		        System.out.print("Enter tax: ");
		        double tax = sc.nextDouble();

		        double netSalary = basic + bonus - tax;
		        
		        System.out.println("\n--- Salary Details ---");
		        System.out.println("Net Salary: " + netSalary);

		        sc.close();
	}

}
