package Inheritance.model;

public class Course {
    private long c_id;
    private String title;
    private int creditPoint;
    private Professor professor;
    public static int counter = 100000;

    public long getC_id() {
        return c_id;
    }

    public void setId() {
        this.c_id = counter;
        counter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.matches("^[\\w\\-\\s]+$")) {  // // [a-zA-Z][a-zA-Z ]+
            this.title = title;
        } else {
            this.title = "Invalid Title";
            System.err.println("Invalid input for setTitle");

        }
    }

    public int getCreditPoint() {
        return creditPoint;
    }

    public void setCreditPoint(int creditPoint) {
        if (creditPoint>0 && creditPoint <=20) {
            this.creditPoint = creditPoint;
        } else {
            this.creditPoint = -1;
            System.err.println("Invalid input for creditPoint");
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    //!
    public void setProfessor(Professor professor) {
        if (professor != null){
            this.professor = professor;
        } else {
            this.professor = new Professor();
        }
    }

    public static int getCounter() {
        return counter;
    }

    public Course(String title, int creditPoint, Professor professor) {
        setId();
        setTitle(title);
        setCreditPoint(creditPoint);
        setProfessor(professor);
    }

    public Course() {
        setId();
        setTitle("Nezināms kurss");
        setCreditPoint(creditPoint);
        setProfessor(new Professor());
    }

    @Override
    public String toString() {
        return "Course{" +
                "c_id=" + c_id +
                ", title='" + title + '\'' +
                ", creditPoint=" + creditPoint +
                ", professor=" + professor +
                '}';
    }
}
