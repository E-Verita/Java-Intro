package seminarz2.model;

public class Grade {
    private long g_id;
    private int value;
    private Student student;
    private Course course;
    public static int counter = 200000;

    public long getG_id() {
        return g_id;
    }

    public void setId() {
        this.g_id = counter;
        counter++;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value>0 && value <=10) {
            this.value = value;
        } else {
            this.value = -1;
            System.err.println("Invalid input for value");
        }
    }

    public Student getStudent() {
        return student;
    }

    //TODO: Pārjautāt!!!
    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    //TODO: Pārjautāt!!!
    public void setCourse(Course course) {
        this.course = course;
    }

    public static int getCounter() {
        return counter;
    }

    public Grade(int value, Student student, Course course ){
        setId();
        setValue(value);
        setStudent(student);
        setCourse(course);
    }

    public Grade(){
        setId();
        setValue(0);
        setStudent(new Student());
        setCourse(new Course());
    }

    @Override
    public String toString() {
        return "Grade{" +
                "g_id=" + g_id +
                ", value=" + value +
                ", student=" + student +
                ", course=" + course +
                '}';
    }
}
