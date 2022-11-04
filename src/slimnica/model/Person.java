package slimnica.model;

public class Person {
    private String name;
    private String surname;
    private String identificator;
    private Gender gender;
    private Nationality nationality;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static String getIdentificator(String idetificator) {
        return idetificator;
    }

    public Gender getGender() {
        return gender;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public String getIdentificator() {
        return identificator;
    }

    public void setName(String name) {
        if (name != null
                && name.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public void setSurname(String surname) {
        if (surname != null
                && surname.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+[-]?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")) {
            this.surname = surname;
        } else {
            this.surname = "Unknown";
        }
    }

    public void setIdentificator(String identificator) {
        if (identificator != null && identificator.matches("[0-9]{6}-[0-9]{5}")) {
            this.identificator = identificator;
        } else {
            this.identificator = "000000-00000";
        }
    }

    public void setGender(Gender gender) {
        if (gender.equals(Gender.male) || (gender.equals(Gender.female))) {
            this.gender = gender;
        } else {
            this.gender = Gender.female;
        }
    }

    public void setNationality(Nationality nationality) {
        if (nationality.equals(Nationality.Estonian) || (nationality.equals(Nationality.Latvian))) {
            this.nationality = nationality;
        } else {
            this.nationality = Nationality.Latvian;
        }
    }

    public Person() {
        setName("Test");
        setSurname("Person");
        setGender(Gender.male);
        setNationality(Nationality.Latvian);
        setIdentificator("000000-00000");
    }

    public Person(String name, String surname, String identificator) {
        setName(name);
        setSurname(surname);
        setIdentificator(identificator);
        setGender(Gender.male);
        setNationality(Nationality.Latvian);

    }

    public Person(String name, String surname, String personCode, Gender gender, Nationality nationality) {
        setName(name);
        setSurname(surname);
        setIdentificator(personCode);
        setGender(gender);
        setNationality(nationality);

    }

    public String toString() {
        return name + " " + surname + " " + identificator + ", " + gender + " " + nationality;
    }

}

