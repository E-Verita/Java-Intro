package seminars7.models;

//ja klase final - to nekad nevarēs mantot

public class Patient {
    //1. Mainīgi
    private String name;        //konkrētam objektam sava vērtība
    private String surname;     //konkrētam objektam sava vērtība
    private int id;             //konkrētam objektam sava vērtība
    public static int counter = 1000;            //visiem objektiem 1 kopīgs
    private final String HOSPITAL = "Ziemeļkurzemes";

    public static int getCounter() {
        return counter;
    }


    //2. set&get
    //DONE: Set funkcijām atbilstošas pārbaudes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[A-Z]{1}[a-z]+")) {
            this.name = name;
        } else {
            this.name = "Nekorekti ievadīts vārds";
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.matches("[A-Z]{1}[a-z]+")) {
            this.surname = surname;
        } else {
            this.surname = "Nekorekti ievadīts uzvārds";
        }
    }

    public int getId() {
        return id;
    }

    //nevajag ļaut lietotājam ievadīt, veidojas no counter
    public void setId() {
        this.id = counter;
        counter++;
    }

    public String getSlimnica() {
        return HOSPITAL;
    }
//3. constructor

    public Patient(String name, String surname) {
        setName(name);
        setSurname(surname);
        setId();
    }

    public Patient() {
        setName("Nezināms Vārds");
        setSurname("Nezināms Uzvārds");
        setId();
    }

    //4. to string

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id + ". hospital=" + HOSPITAL +
                '}';
    }

}


