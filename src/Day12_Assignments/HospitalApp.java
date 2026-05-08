package Day12_Assignments;
import java.io.*;
import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            File file = new File("patient.txt");

            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

            System.out.println("\nHospital Management System-");

            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Patient Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Disease: ");
            String disease = sc.nextLine();

            System.out.print("Enter Doctor Name: ");
            String doctor = sc.nextLine();

            System.out.print("Enter Room Number: ");
            int room = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Medical Report: ");
            String report = sc.nextLine();

            PrintWriter pw = new PrintWriter(
                    new FileWriter(file));

            pw.println("Patient Medical Report-");
            pw.println("Patient ID      : " + id);
            pw.println("Patient Name    : " + name);
            pw.println("Patient Age     : " + age);
            pw.println("Disease         : " + disease);
            pw.println("Doctor Name     : " + doctor);
            pw.println("Room Number     : " + room);
            pw.println("Medical Report  : " + report);

            pw.close();

            System.out.println("\nPatient Record Saved Successfully");

            BufferedReader br =
                    new BufferedReader(
                    new FileReader(file));

            String line;

            System.out.println("\nPatient Details-\n");

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
