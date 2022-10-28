package seminars2.model;
public class Professor {
    private long p_id;
    private String name;
    private String surname;
    private Degree degree;
    public static int counter = 0;

    public long getP_id() {
        return p_id;
    }
    public void setId() {
        this.p_id = counter;
        counter++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")) {
            this.name = name;
        } else {
            this.name = "Invalid Name";
            System.err.println("Invalid input for name");
        }
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")) {
            this.surname = surname;
        } else {
            this.surname = "Invalid Surname";
            System.err.println("Invalid input for surname");
        }
    }

    public Degree getDegree() {
        return degree;
    }

    //todo: find regex!
    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public static int getCounter() {
        return counter;
    }


    public Professor(String name, String surname, Degree degree ){
        setId();
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }
    public Professor(){
        setId();
        setName("No Name");
        setSurname("No Surname");
        setDegree(Degree.unknown);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "p_id=" + p_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }
}