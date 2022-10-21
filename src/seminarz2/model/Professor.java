package seminarz2.model;

public class Professor {
    private long p_id;
    private String name;
    private String surname;
    private String degree;
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
        if (name.matches("[A-Z]{1}[a-z]+")) {
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
        if (surname.matches("[A-Z]{1}[a-z]+")) {
            this.surname = surname;
        } else {
            this.surname = "Invalid Surname";
            System.err.println("Invalid input for surname");

        }
    }

    public String getDegree() {
        return degree;
    }

    //todo: find regex!
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public static int getCounter() {
        return counter;
    }


    public Professor(String name, String surname, String degree ){
        setId();
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }

    public Professor(){
        setId();
        setName("No Name");
        setSurname("No Surname");
        setDegree("no degree");
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
