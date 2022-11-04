package slimnica.model;

import java.util.ArrayList;
import java.util.Date;

public class Appointment {
    private int appId;
    private static int appCounter = 10000;
    private Date date;
    private String description;
    private Patient patient;
    private Doctor doctor;

    public int getAppId() {
        return appId;
    }

    public void setAppId() {
        this.appId = appCounter;
        appCounter++;
    }

    public Date getDate() {
        return date;
    }

    //todo Parbaudt vai not null un vai nav ar atpakalejosu datumu //after before funkcijas
    public void setDate(Date date) {
        Date dateNow = new Date();
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Patient getPatient() {
        return patient;
    }

    //todo: not null parbaude
    public void setPatient(Patient patient) {
        if(patient != null) {
            this.patient = patient;
        } else {
            this.patient = new Patient();
        }
    }

    public Doctor getDoctor() {
        return doctor;
    }
    //todo: not null parbaude
    public void setDoctor(Doctor doctor) {
        if(doctor != null) {
            this.doctor = doctor;
        } else {
            this.doctor = new Doctor();
        }
    }

    public Appointment(){
        setAppId();
        setPatient(new Patient());
        setDoctor(new Doctor());
        setDescription("No info");
        setDate(new Date());
    }

    public Appointment(Patient patient, Doctor doctor, Date date, String description){
        setAppId();
        setPatient(patient);
        setDoctor(doctor);
        setDate(date);
        setDescription(description);
    }

    @Override
    public String toString() {
        return "Appointment " + appId + ", patient:" + patient.getSurname() + ", doctor: " +doctor.getSurname() +  ", date:" + date +
                ", description:" + description;
    }
}


