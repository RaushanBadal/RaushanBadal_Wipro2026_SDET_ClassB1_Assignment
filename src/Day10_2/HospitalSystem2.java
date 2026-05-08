package Day10_2;
import java.util.*;

class Patient {
    int id;
    String name;
    int age;

    public Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class HospitalSystem2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Patient> map = new HashMap<>();

        while (true) {
            System.out.println("\n Hospital Patient Records ");
            System.out.println("1. Add Patient");
            System.out.println("2. Update Patient");
            System.out.println("3. View Patient");
            System.out.println("4. Remove Patient");
            System.out.println("5. List All Patients");
            System.out.println("6. Check Patient Exists");
            System.out.println("7. Count Patients");
            System.out.println("8. Clear All");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (map.containsKey(id)) {
                        System.out.println("Patient already exists!");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    map.put(id, new Patient(id, name, age));
                    System.out.println("Patient added!");
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    if (!map.containsKey(uid)) {
                        System.out.println("Patient not found!");
                        break;
                    }

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();

                    map.put(uid, new Patient(uid, newName, newAge));
                    System.out.println("Patient updated!");
                    break;

                case 3:
                    System.out.print("Enter ID to view: ");
                    int vid = sc.nextInt();

                    if (map.containsKey(vid)) {
                        System.out.println(map.get(vid));
                    } else {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to remove: ");
                    int rid = sc.nextInt();

                    if (map.remove(rid) != null) {
                        System.out.println("Patient removed!");
                    } else {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 5:
                    if (map.isEmpty()) {
                        System.out.println("No patients available.");
                    } else {
                        for (Patient p : map.values()) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter ID to check: ");
                    int cid = sc.nextInt();

                    if (map.containsKey(cid)) {
                        System.out.println("Patient exists.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 7:
                    System.out.println("Total Patients: " + map.size());
                    break;

                case 8:
                    map.clear();
                    System.out.println("All records cleared!");
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
