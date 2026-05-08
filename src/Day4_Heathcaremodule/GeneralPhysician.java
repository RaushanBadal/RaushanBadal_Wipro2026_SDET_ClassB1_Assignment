package Day4_Heathcaremodule;

public class GeneralPhysician extends Doctor {

    public GeneralPhysician(String name) {
        super(name, "General");
    }

    public void diagnose(Patient patient) {
        System.out.println(name + " (General Physician) checks "
                + patient.getName() + " for "
                + patient.getIllness());
    }
}
