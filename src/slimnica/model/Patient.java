package slimnica.model;

public class Patient extends Person{
    private int patientId;
    private static int patientCounter = 1000;
    private boolean isHospitalised;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId() {
        this.patientId = patientCounter;
        patientId ++;
    }

    public boolean isHospitalised() {
        return isHospitalised;
    }

    public void setHospitalised(boolean hospitalised) {
        isHospitalised = hospitalised;
    }

    public Patient(){
        super();
        setHospitalised(false);
        setPatientId();
    }

    public Patient(String name, String surname, String personCode, Gender gender, Nationality nationality, boolean isHospitalised) {
        super(name, surname, personCode, gender, nationality);
        setHospitalised(isHospitalised);
        setPatientId();
    }

    @Override
    public String toString() {
        return patientId + ":" + super.toString() + " " + ((isHospitalised) ? ", in hospital." : "can go home.");
    }
}
