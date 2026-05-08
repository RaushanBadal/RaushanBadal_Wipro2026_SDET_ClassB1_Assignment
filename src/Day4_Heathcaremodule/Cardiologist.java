package Day4_Heathcaremodule;
public class Cardiologist extends Doctor {

    public Cardiologist(String name) {
        super(name, "Cardiology");
    }

    public void diagnose(Patient patient) {

        if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println(name + " treats heart patient: "
                    + patient.getName());
        } else {
            System.out.println(name + " says "
                    + patient.getName()
                    + " does not need heart treatment");
        }
    }
}

