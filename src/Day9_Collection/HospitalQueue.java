package Day9_Collection;
import java.util.*;

class Patient1 {
 int id;
 String name;

 Patient1(int id, String name) {
     this.id = id;
     this.name = name;
 }

 void display() {
     System.out.println("ID: " + id + ", Name: " + name);
 }
}

public class HospitalQueue {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     LinkedList<Patient1> queue = new LinkedList<>();

     while (true) {
         System.out.println("\n--- Hospital Queue System ---");
         System.out.println("1. Add Patient (Normal)");
         System.out.println("2. Add Patient (Emergency)");
         System.out.println("3. Remove Patient");
         System.out.println("4. View All Patients");
         System.out.println("5. First Patient");
         System.out.println("6. Last Patient");
         System.out.println("7. Exit");
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

                 queue.addLast(new Patient1(id, name));
                 System.out.println("Patient added to queue.");
                 break;

             case 2:
                 System.out.print("Enter ID: ");
                 int eid = sc.nextInt();
                 sc.nextLine();

                 System.out.print("Enter Name: ");
                 String ename = sc.nextLine();

                 queue.addFirst(new Patient1(eid, ename));
                 System.out.println("Emergency patient added at front!");
                 break;

             case 3:
                 if (queue.isEmpty()) {
                     System.out.println("Queue is empty.");
                 } else {
                     Patient1 removed = queue.removeFirst();
                     System.out.println("Removed Patient:");
                     removed.display();
                 }
                 break;

             case 4:
                 if (queue.isEmpty()) {
                     System.out.println("No patients in queue.");
                 } else {
                     System.out.println("\nPatient Queue:");
                     for (Patient1 p : queue) {
                         p.display();
                     }
                 }
                 break;

             case 5:
                 if (!queue.isEmpty()) {
                     System.out.println("First Patient:");
                     queue.getFirst().display();
                 } else {
                     System.out.println("Queue is empty.");
                 }
                 break;

             case 6:
                 if (!queue.isEmpty()) {
                     System.out.println("Last Patient:");
                     queue.getLast().display();
                 } else {
                     System.out.println("Queue is empty.");
                 }
                 break;

             case 7:
                 System.out.println("Exiting...");
                 sc.close();
                 return;

             default:
                 System.out.println("Invalid choice!");
         }
     }
 }
}