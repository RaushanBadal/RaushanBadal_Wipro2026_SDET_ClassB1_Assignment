package Day10_;
import java.util.*;

class Patient implements Comparable<Patient> {
 int id;
 String name;

 Patient(int id, String name) {
     this.id = id;
     this.name = name;
 }

 @Override
 public int compareTo(Patient p) {
     return this.id - p.id; 
 }

 void display() {
     System.out.println("ID: " + id + ", Name: " + name);
 }
}

public class HospitalTreeSet {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     TreeSet<Patient> patients = new TreeSet<>();

     while (true) {
         System.out.println("\nHospital Registration (TreeSet)");
         System.out.println("1. Register Patient");
         System.out.println("2. View All Patients");
         System.out.println("3. Exit");
         System.out.print("Enter choice: ");

         int choice = sc.nextInt();
         sc.nextLine();

         switch (choice) {

             case 1:
                 System.out.print("Enter ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();

                 System.out.print("Enter Name: ");
                 String name = sc.nextLine();

                 Patient p = new Patient(id, name);

                 if (!patients.add(p)) {
                     System.out.println("Patient with this ID already registered!");
                 } else {
                     System.out.println("Patient added successfully!");
                 }
                 break;

             case 2:
                 if (patients.isEmpty()) {
                     System.out.println("No patients registered.");
                 } else {
                     System.out.println("\nRegistered Patients (Sorted by ID):");
                     for (Patient pat : patients) {
                         pat.display();
                     }
                 }
                 break;

             case 3:
                 System.out.println("Exiting...");
                 sc.close();
                 return;

             default:
                 System.out.println("Invalid choice!");
         }
     }
 }
}