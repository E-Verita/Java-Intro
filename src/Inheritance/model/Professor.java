package Inheritance.model;

public class Professor extends Person{
    private long p_id;
    private Degree degree;
    public static int counter = 0;

    public long getP_id() {
        return p_id;
    }
    public void setId() {
        this.p_id = counter;
        counter++;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public static int getCounter() {
        return counter;
    }


    public Professor(String name, String surname, Degree degree ){
        super(name, surname);
        setId();
        setDegree(degree);
    }
    public Professor(){
        super();
        setId();
        setDegree(Degree.unknown);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "p_id=" + p_id + super.toString() + ", degree='" + degree + '\'' + '}';
    }
}