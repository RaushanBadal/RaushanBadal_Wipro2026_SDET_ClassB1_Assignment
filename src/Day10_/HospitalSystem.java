package Day10_;
import java.util.*;

public class HospitalSystem implements Comparable<HospitalSystem> {

    int id;
    String name;

    public HospitalSystem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(HospitalSystem p) {
        return Integer.compare(this.id, p.id);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<HospitalSystem> patients = new TreeSet<>();

        while (true) {
            System.out.println("\nHospital Registration System");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    HospitalSystem p = new HospitalSystem(id, name);

                    if (!patients.add(p)) {
                        System.out.println("ID already registered!");
                    } else {
                        System.out.println("Patient added to the system!");
                    }
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients registered.");
                    } else {
                        System.out.println("\n--- Unique Registered Patients ---");
                        for (HospitalSystem patient : patients) {
                            System.out.println(patient);
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
