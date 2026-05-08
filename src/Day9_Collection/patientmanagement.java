package Day9_Collection;

import java.util.*;

class Patient {
 int id;
 String name;
 int age;
 String disease;

 Patient(int id, String name, int age, String disease) {
     this.id = id;
     this.name = name;
     this.age = age;
     this.disease = disease;
 }

 void display() {
     System.out.println("ID: " + id + 
                        ", Name: " + name + 
                        ", Age: " + age + 
                        ", Disease: " + disease);
 }
}

public class patientmanagement {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     ArrayList<Patient> patients = new ArrayList<>();

     while (true) {
         System.out.println("\n Patient Management System");
         System.out.println("1. Add Patient");
         System.out.println("2. View All Patients");
         System.out.println("3. Search Patient by Name");
         System.out.println("4. Exit");
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

                 System.out.print("Enter Age: ");
                 int age = sc.nextInt();
                 sc.nextLine();

                 System.out.print("Enter Disease: ");
                 String disease = sc.nextLine();

                 patients.add(new Patient(id, name, age, disease));
                 System.out.println("Patient added successfully!");
                 break;

             case 2:
                 if (patients.isEmpty()) {
                     System.out.println("No patients found.");
                 } else {
                     System.out.println("\nPatient List:");
                     for (Patient p : patients) {
                         p.display();
                     }
                 }
                 break;

             case 3:
                 System.out.print("Enter name to search: ");
                 String searchName = sc.nextLine();

                 boolean found = false;
                 for (Patient p : patients) {
                     if (p.name.equalsIgnoreCase(searchName)) {
                         p.display();
                         found = true;
                     }
                 }

                 if (!found) {
                     System.out.println("Patient not found.");
                 }
                 break;

             case 4:
                 System.out.println("Exiting...");
                 sc.close();
                 return;

             default:
                 System.out.println("Invalid choice!");
         }
     }
 }
}