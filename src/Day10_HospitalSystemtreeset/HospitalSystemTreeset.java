package Day10_HospitalSystemtreeset;
import java.util.*;

class Patient implements Comparable<Patient> {
    int id;
    String name;
    int age;

    public Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Patient p) {
        return this.id - p.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class HospitalSystemTreeset {

    private static TreeSet<Patient> patients = new TreeSet<>();

    public static void addPatient(int id, String name, int age) {
        Patient p = new Patient(id, name, age);
        if (patients.add(p)) {
            System.out.println("Patient added.");
        } else {
            System.out.println("Patient already exists.");
        }
    }

    public static Patient findPatient(int id) {
        for (Patient p : patients) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

    public static void updatePatient(int id, String name, int age) {
        Patient p = findPatient(id);
        if (p != null) {
            patients.remove(p);
            patients.add(new Patient(id, name, age));
            System.out.println("Patient updated.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    public static void removePatient(int id) {
        Patient p = findPatient(id);
        if (p != null) {
            patients.remove(p);
            System.out.println("Patient removed.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    public static void retrievePatient(int id) {
        Patient p = findPatient(id);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Patient not found.");
        }
    }

    public static void listPatients() {
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    public static void checkPatient(int id) {
        if (findPatient(id) != null) {
            System.out.println("Patient exists.");
        } else {
            System.out.println("Patient does not exist.");
        }
    }

    public static void countPatients() {
        System.out.println("Total Patients: " + patients.size());
    }

    public static void clearSystem() {
        patients.clear();
        System.out.println("System cleared.");
    }

    public static void main(String[] args) {

        addPatient(101, "Raushan", 25);
        addPatient(102, "Amit", 30);
        addPatient(103, "Neha", 22);

        System.out.println("\nAll Patients:");
        listPatients();

        System.out.println("\nRetrieve:");
        retrievePatient(102);

        System.out.println("\nUpdate:");
        updatePatient(102, "Amit Sharma", 31);

        System.out.println("\nRemove:");
        removePatient(103);

        System.out.println("\nCheck:");
        checkPatient(101);

        System.out.println("\nCount:");
        countPatients();

        System.out.println("\nClear:");
        clearSystem();
    }
}