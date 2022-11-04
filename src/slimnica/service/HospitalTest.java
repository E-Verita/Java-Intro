package slimnica.service;

import slimnica.model.*;

import java.util.ArrayList;
import java.util.Date;

public class HospitalTest {

    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Valdis", "Zatlers", "121212-12345", Gender.male, Nationality.Latvian, Speciality.Kid, (short) 101);
        Doctor doc2 = new Doctor("Juris", "Ozols", "11122-12345", Gender.male, Nationality.Latvian, Speciality.Kid, (short) 101);
        doctors.add(doc1);
        doctors.add(doc2);
        Patient pat1 = new Patient("Everita", "Vecberza", "11111-22222", Gender.female, Nationality.Latvian, false);
        patients.add(pat1);
        Appointment app1 = new Appointment(pat1, doc1, new Date(2022, 12, 12, 10, 10, 0), "Auss iekaisums");
        System.out.println(pat1);

    }

    //CRUD - create - retrieve - update - delete
    //CRUD - doctor

    public static boolean createDoctor(String name, String surname, String personCode, Gender gender, Nationality nationality,  Speciality speciality, short officeNum) {
        Doctor doc1 = new Doctor(name, surname, personCode, gender, nationality, speciality, officeNum);
        for (Doctor temp : doctors) {
            if (temp.getIdentificator().equals(personCode)) {
                return false;
            }
        }

        doctors.add(doc1);
        return true;
    }

    public static ArrayList<Doctor> retrieveDoctor() {
        return doctors;
    }

    public static boolean deleteDoctorByPersonalCode(String personCode) {
        for (Doctor temp : doctors) {
            if (temp.getIdentificator().equals(personCode)) {
                doctors.remove(temp);
                return true;
            }
        }
        return false;
    }

    public static boolean updateDoctorByPersonalCode(String personCode, Doctor updatedDoctor) {
        for (Doctor temp : doctors) {
            if (temp.getIdentificator().equals(personCode)) {
                temp.setName(updatedDoctor.getName());
                temp.setNationality(updatedDoctor.getNationality());
                temp.setSurname(updatedDoctor.getSurname());
                temp.setOfficeNum(updatedDoctor.getOfficeNum());
                return true;
            }
        }
        return false;

    }

}
