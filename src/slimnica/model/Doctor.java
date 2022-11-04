package slimnica.model;

public class Doctor extends Person{
    private Speciality speciality;
    private short officeNum;
    private int doctorId;
    private static int doctorCounter = 4000;

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        if (speciality.equals(Speciality.Kid) || (speciality.equals(Speciality.Heart))) {
            this.speciality = speciality;
        } else {
            this.speciality = Speciality.Kid;
        }
    }

    public short getOfficeNum() {
        return officeNum;
    }

    public void setOfficeNum(short officeNum) {
        if (officeNum > 0){
            this.officeNum = (short) officeNum;
        } else {
            this.officeNum = (short)0;
        }
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId() {
        this.doctorId = doctorCounter;
        doctorCounter++;
    }

    public Doctor() {
        super();
        setSpeciality(Speciality.Kid);
        setOfficeNum((short)0);
        setDoctorId();
    }

    public Doctor(String name, String surname, String personCode, Gender gender, Nationality nationality, Speciality speciality, short officeNum) {
        super(name, surname, personCode, gender, nationality);
        setSpeciality(speciality);
        setOfficeNum(officeNum);
        setDoctorId();
    }

    @Override
    public String toString() {
        return doctorId + ":" + super.toString() + ", speciality: " + speciality + ", office number: " + officeNum;
    }


}
