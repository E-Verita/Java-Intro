package Inheritance.model;
public class Person {

    //1.mainīgie
    private String name;
    private String surname;
    //2. get un set
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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

    public Person() {
        setName("Test");
        setSurname("Person");
    }

    public Person(String name, String surname)
    {
        setName(name);
        setSurname(surname);
    }

    public String toString()
    {
        return name + " " + surname;
    }
}