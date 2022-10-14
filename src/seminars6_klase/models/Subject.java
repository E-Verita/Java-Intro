package seminars6_klase.models;

public class Subject {

    //1. Izveidot mainīgos
    private String name;
    private String teacher;
    private byte creditPoints;
    StudyProgram program;

    //2. Get & Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("^[\\w\\-\\s]+$")) {  // // [a-zA-Z][a-zA-Z ]+
            this.name = name;
        } else {
            this.name = "nav norādīts";
        }
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        if (teacher.matches("[A-Z]{1}[a-z]+")){
            this.teacher = teacher;
        } else {
            this.teacher = "nav norādīts";
        }
    }


    public byte getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(byte creditPoints) {
        if (creditPoints > 0 && creditPoints <= 20) {
            this.creditPoints = creditPoints;
        } else {
            this.creditPoints = 0;
        }
    }

    public StudyProgram getProgram() {
        return program;
    }

    public void setProgram(StudyProgram program) {
        if(program != null) {
            this.program = program;
        }
        else{
            this.program = StudyProgram.other;
        }
    }


    //3. Konstruktori - all & zero

    public Subject(String name, String teacher, byte creditPoints, StudyProgram program) {
        setName(name);
        setTeacher(teacher);
        setCreditPoints(creditPoints);
        setProgram(program);
    }

    public Subject() {
        setName("Not given");
        setTeacher("Not given");
        setCreditPoints((byte) 0);
        setProgram(StudyProgram.other);
    }

    //4. toString


    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", creditPoints=" + creditPoints +
                ", program=" + program +
                '}';
    }
}
