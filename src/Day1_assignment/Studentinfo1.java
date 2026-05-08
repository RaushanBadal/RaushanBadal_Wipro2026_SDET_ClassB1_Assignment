package Day1_assignment;
import java.util.Scanner;
public class Studentinfo1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter student name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
	        System.out.print("Enter marks in 3 subjects: ");
	        float m1 = sc.nextFloat();
	        float m2 = sc.nextFloat();
	        float m3 = sc.nextFloat();

	        float avg = (m1 + m2 + m3) / 3;
	        System.out.println("Average Marks: " + avg);
	        sc.close();
	}

}
