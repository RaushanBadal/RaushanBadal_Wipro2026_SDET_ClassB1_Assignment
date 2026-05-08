package Day4_Heathcaremodule;

import java.util.*;

public class PatientServiceImpl implements PatientService {

    private Map<Integer, Patient> patients = new HashMap<>();

    public void registerPatient(Patient patient) {
        patients.put(patient.getId(), patient);
        System.out.println("Patient Registered: " + patient.getName());
    }

    public void showPatients() {
        System.out.println("\n--- Patient List ---");

        for (Patient p : patients.values()) {
            System.out.println(
                p.getId() + " | " +
                p.getName() + " | " +
                p.getAge() + " | " +
                p.getIllness()
            );
        }
    }
}