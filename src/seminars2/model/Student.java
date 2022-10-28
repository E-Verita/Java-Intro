package seminars2.model;
public class Student {
    private long st_id;
    private String name;
    private String surname;
    public static int counter = 10000;

    public long getSt_id() {
        return st_id;
    }
    public void setId() {
        this.st_id = counter;
        counter++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")){
            this.name = name;
        } else {
            this.name = "Nekorekti ievadīts vārds";
        }
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")) {
            this.surname = surname;
        } else {
            this.surname = "Nekorekti ievadīts uzvārds";
        }
    }
    public static int getCounter() {
        return counter;
    }
    public Student( String name, String surname){
        setId();
        setName(name);
        setSurname(surname);
    }
    public Student(){
        setId();
        setName("No Name");
        setSurname("No Surname");
    }
    @Override
    public String toString() {
        return "Student{" +
                "st_id=" + st_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
