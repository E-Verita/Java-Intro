package seminars6_klase.models;

import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private short [] birthday;
    private byte [] grades;
    private int matriculateNo;
    private boolean isInBudget;

    public Student(String name, String surname, short[] birthday, byte[] grades, int matriculateNo, boolean isInBudget, StudyProgram studyProgram, StudyLevel studyLevel) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.grades = grades;
        this.matriculateNo = matriculateNo;
        this.isInBudget = isInBudget;
        this.studyProgram = studyProgram;
        this.studyLevel = studyLevel;
    }

    public Student() {
    }


    private StudyProgram studyProgram;
    private StudyLevel studyLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[A-Z]{1}[a-z]+")){
            this.name = name;
        } else {
            this.name = "nav norādīts";
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.matches("[A-Z]{1}[a-z]+")){
            this.surname = surname;
        } else {
            this.surname = "nav norādīts";
        }
    }

    public short[] getBirthday() {
        return birthday;
    }

    public void setBirthday(short[] birthday) {
        if (birthday.length==3 && birthday[0]>=1900 && birthday[0]<= 2010 & birthday[1]<=12 &&birthday[1]>0 && birthday[2]>0 && birthday[2]<=31){
            this.birthday = birthday;
        } else {
            this.birthday = new short[]{0, 0, 0};
        }
    }

    public byte[] getGrades() {
        return grades;
    }

    public void setGrades(byte[] grades) {
        byte [] gradesNew = new byte[grades.length];
        for (int i =0; i<grades.length; i++){
            if (grades[i] >=0 && grades[i] <= 10){
                gradesNew[i] = grades[i];
            } else {
                gradesNew[i] = -1;
            }
        }
        this.grades = gradesNew;
    }

    public int getMatriculateNo() {
        return matriculateNo;
    }

    public void setMatriculateNo() { //todo uztaisit, lai programma genere
        this.matriculateNo = 0001;
    }

    public boolean isInBudget() {
        return isInBudget;
    }

    public void setInBudget(boolean inBudget) {
        isInBudget = inBudget;
    }

    public StudyProgram getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(StudyProgram studyProgram) {
        if(studyProgram != null) {
            this.studyProgram = studyProgram;
        }
        else{
            this.studyProgram = StudyProgram.other;
        }
    }

    public StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(StudyLevel studyLevel) {
        if(studyLevel != null) {
            this.studyLevel = studyLevel;
        }
        else{
            this.studyLevel = StudyLevel.not_given;
        }
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + Arrays.toString(birthday) +
                ", grades=" + Arrays.toString(grades) +
                ", matriculateNo=" + matriculateNo +
                ", isInBudget=" + isInBudget +
                ", studyProgram=" + studyProgram +
                ", studyLevel=" + studyLevel +
                '}';
    }
}
