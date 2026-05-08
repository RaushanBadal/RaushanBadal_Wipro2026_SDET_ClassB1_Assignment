package Day4_Heathcaremodule;
public class MainApp {
    public static void main(String[] args) {

        
        PatientService service = new PatientServiceImpl();

        
        Patient p1 = new Patient(1, "Rahul", 25, "Fever");
        Patient p2 = new Patient(2, "Amit", 55, "Heart Problem");

        
        service.registerPatient(p1);
        service.registerPatient(p2);

        
        service.showPatients();

       
        Doctor d1 = new GeneralPhysician("Dr. Sharma");
        Doctor d2 = new Cardiologist("Dr. Mehta");

        System.out.println("\n--- Diagnosis ---");

        d1.diagnose(p1);
        d1.diagnose(p2);

        d2.diagnose(p1);
        d2.diagnose(p2);
    }
}
