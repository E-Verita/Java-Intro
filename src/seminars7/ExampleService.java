package seminars7;

import seminars7.models.Patient;

import java.util.ArrayList;

public class ExampleService {

    public static void main(String[] args) {
        //DONE: Izveidot 3 pacientus
        Patient patient1 = new Patient("Hari", "Seldon");
        Patient patient2 = new Patient("Gaal", "Dornick");
        Patient patient3 = new Patient("Salvor", "Hardin");

        //DONE: ielikt pacientus masīvā
        Patient[] patients = {patient1, patient2, patient3};

        //DONE: iziet cauri masīvam un izprintēt katru pacientu
        for(Patient temp: patients){
            System.out.println(temp);        }

        //DONE: ar ArrayList

        ArrayList<Patient> patientarray = new ArrayList<>();
        patientarray.add(patient1);
        patientarray.add(patient2);
        patientarray.add(patient3);

        System.out.println("As ArrayList: " + patientarray);

        // Piekļūt statiskajam mainīgajam // counter = 1003
        System.out.println(Patient.counter);
        Patient.counter++;
        System.out.println(Patient.counter);
        System.out.println("1. pacienta counter: " + patient1.getCounter() + " , 2. pacienta: " + patient2.getCounter() + " 3. pacienta: " + patient3.getCounter());
        System.out.println("As ArrayList: " + patientarray);



    }





}
