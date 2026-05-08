package Day9_hashset;
import java.util.*;

class Patient {
 int id;
 String name;

 Patient(int id, String name) {
     this.id = id;
     this.name = name;
 }

 void display() {
     System.out.println("ID: " + id + ", Name: " + name);
 }
}

public class HospitalHashSet {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     HashSet<Patient> patients = new HashSet<>();

     while (true) {
         System.out.println("\n Hospital Registration System");
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

                 boolean exists = false;

                 for (Patient p : patients) {
                     if (p.id == id) {
                         exists = true;
                         break;
                     }
                 }

                 if (exists) {
                     System.out.println("Patient with this ID already registered!");
                 } else {
                     patients.add(new Patient(id, name));
                     System.out.println("Patient added successfully!");
                 }
                 break;

             case 2:
                 if (patients.isEmpty()) {
                     System.out.println("No patients registered.");
                 } else {
                     System.out.println("\nRegistered Patients:");
                     for (Patient p : patients) {
                         p.display();
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