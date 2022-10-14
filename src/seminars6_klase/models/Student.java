package seminars6_klase.models;

import java.util.Arrays;

public class Student {
    // 1. Izveidot mainīgos
    private String name;
    private String surname;
    private short [] birthday;
    private byte [] grades;
    private int matriculateNo;
    private boolean isInBudget;
    private StudyProgram studyProgram;
    private StudyLevel studyLevel;
    //todo: 2. pārveidot Student klasi, kurai pievienot masīvu no priekšmetiem, kurus viņš apmeklēs  + set&get + konstruktori + toString
    private Subject [] subjects;

    // 2. Get un set funkcijas

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

    //gggg mm dd
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

    public void setMatriculateNo(int matriculateNo) { //todo uztaisit, lai programma genere
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

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    // 3. Konstrukotrs
    public Student(String name, String surname, short[] birthday, byte[] grades, int matriculateNo, boolean isInBudget, StudyProgram studyProgram, StudyLevel studyLevel, Subject[] subjects) {
        setName(name);
        setSurname(surname);
        setBirthday(birthday);
        setGrades(grades);
        setMatriculateNo(matriculateNo);
        setInBudget(isInBudget);
        setStudyProgram(studyProgram);
        setStudyLevel(studyLevel);
        setSubjects(subjects);
    }

    public Student(String name, String surname, short[] birthday, StudyProgram studyProgram, StudyLevel studyLevel) {
        setName(name);
        setSurname(surname);
        setBirthday(birthday);
        setGrades(new byte[20]);
        setMatriculateNo(0);
        setInBudget(false);
        setStudyProgram(studyProgram);
        setStudyLevel(studyLevel);
        setSubjects(new Subject[10]);
    }

    public Student() {
        setName("Nav zināms");
        setSurname("Nav zināms");
        setBirthday(new short[]{1910, 1, 1});
        setGrades(new byte[20]);
        setMatriculateNo(0);
        setInBudget(false);
        setStudyProgram(StudyProgram.other);
        setStudyLevel(StudyLevel.not_given);
        setSubjects(new Subject[10]);
    }
    public Student(String name, String surname, short[] birthday, byte[] grades, int matriculateNo, boolean isInBudget, StudyProgram studyProgram, StudyLevel studyLevel) {
        setName(name);
        setSurname(surname);
        setBirthday(birthday);
        setGrades(grades);
        setMatriculateNo(matriculateNo);
        setInBudget(isInBudget);
        setStudyProgram(studyProgram);
        setStudyLevel(studyLevel);
        setSubjects(new Subject[]{new Subject("English", "Janis", (byte) 2, StudyProgram.Programmēšanas_speciālists)});
    }


    // 4. To String


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + Arrays.toString(birthday) +
                ", grades=" + Arrays.toString(grades) +
                ", matriculateNo=" + matriculateNo +
                ", isInBudget=" + isInBudget +
                ", studyProgram=" + studyProgram +
                ", studyLevel=" + studyLevel +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }

}
