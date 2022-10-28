package seminarz2.service;

import seminarz2.model.*;

import java.util.ArrayList;

public class VeA_IS {
    static ArrayList<Grade> gradeArrayList = new ArrayList<>();
    static ArrayList<Course> courseArrayList = new ArrayList<>();
    static ArrayList<Professor> professorList = new ArrayList<>();
    static ArrayList<Student> studentArrayList = new ArrayList<>();


    public static void main(String[] args) {

        // PROFESORI
        Professor prof_kar = new Professor("Karina", "Skirmante", Degree.Master);
        Professor prof_and = new Professor("Andis", "Pilans", Degree.Master);
        Professor prof_est = new Professor("Estere", "Vitola", Degree.Master);
        Professor prof_uld = new Professor("Uldis", "Kuplis", Degree.Master);

        professorList.add(prof_kar);
        professorList.add(prof_and);
        professorList.add(prof_est);
        professorList.add(prof_uld);


        // STUDENTI
        Student st_ev = new Student("Everita", "Vecberza");
        Student st_av = new Student("Andris", "Vitols");
        Student st_ee = new Student("Egils", "Egle");
        Student st_ao = new Student("Armands", "Osis");

        studentArrayList.add(st_ev);
        studentArrayList.add(st_av);
        studentArrayList.add(st_ee);
        studentArrayList.add(st_ao);

        // COURSES
        Course course1 = new Course("Java", 2, prof_kar);
        Course course2 = new Course("IT Standards", 2, prof_and);
        Course course3 = new Course("Python", 4, prof_est);
        Course course4 = new Course("IT Prtoject Management", 4, prof_uld);
        Course course5 = new Course("Java Intro", 4, prof_kar);

        courseArrayList.add(course1);
        courseArrayList.add(course2);
        courseArrayList.add(course3);
        courseArrayList.add(course4);
        courseArrayList.add(course5);

        //GRADES
        Grade grade_ev1 = new Grade(10, st_ev, course1);
        Grade grade_ev2 = new Grade(8, st_ev, course2);
        Grade grade_ev3 = new Grade(4, st_ev, course3);
        Grade grade_ev4 = new Grade(9, st_ev, course4);
        Grade grade_ev5 = new Grade(9, st_ev, course5);

        Grade grade_av1 = new Grade(7, st_av, course1);
        Grade grade_av2 = new Grade(8, st_av, course2);
        Grade grade_av3 = new Grade(9, st_av, course3);
        Grade grade_av4 = new Grade(10, st_av, course4);
        Grade grade_av5 = new Grade(9, st_ev, course5);

        Grade grade_ee1 = new Grade(4, st_ee, course1);
        Grade grade_ee2 = new Grade(6, st_ee, course2);
        Grade grade_ee3 = new Grade(4, st_ee, course3);
        Grade grade_ee4 = new Grade(5, st_ee, course4);
        Grade grade_ee5 = new Grade(9, st_ev, course5);

        Grade grade_ao1 = new Grade(10, st_ao, course1);
        Grade grade_ao2 = new Grade(8, st_ao, course2);
        Grade grade_ao3 = new Grade(10, st_ao, course3);
        Grade grade_ao4 = new Grade(10, st_ao, course4);
        Grade grade_ao5 = new Grade(9, st_ev, course5);


        gradeArrayList.add(grade_ev1);
        gradeArrayList.add(grade_ev2);
        gradeArrayList.add(grade_ev3);
        gradeArrayList.add(grade_ev4);
        gradeArrayList.add(grade_ev5);
        gradeArrayList.add(grade_av1);
        gradeArrayList.add(grade_av2);
        gradeArrayList.add(grade_av3);
        gradeArrayList.add(grade_av4);
        gradeArrayList.add(grade_av5);
        gradeArrayList.add(grade_ee1);
        gradeArrayList.add(grade_ee2);
        gradeArrayList.add(grade_ee3);
        gradeArrayList.add(grade_ee4);
        gradeArrayList.add(grade_ee5);
        gradeArrayList.add(grade_ao1);
        gradeArrayList.add(grade_ao2);
        gradeArrayList.add(grade_ao3);
        gradeArrayList.add(grade_ao4);
        gradeArrayList.add(grade_ao5);


        // PRINT

        System.out.println(professorList);
        System.out.println(studentArrayList);
        System.out.println(courseArrayList);
        System.out.println(gradeArrayList);

        // PRINT FUNCTIONS
        for (Grade temp : gradeArrayList) {
            System.out.println(temp);
        }

        for (Student temp : studentArrayList) {
            System.out.println("Average grade for " + temp.getName() + " " + temp.getSurname() + " is " + calculateAVGGrade(temp));
        }
        for (Course temp : courseArrayList) {
            System.out.println("Average grade for " + temp.getTitle() + " is " + calculateAVGGrade(temp));
        }

        for (Professor temp : professorList) {
            System.out.println("Professor " + temp.getName() + " has " + calculateCourseCountForProfessor(temp) + " courses");
        }
        for (Student temp : studentArrayList) {
            System.out.println("Average Weighted grade for " + temp.getName() + " " + temp.getSurname() + " is " + calculateAVGWeightedGrade(temp));
        }
    //todo: pabeigt!
        System.out.println("Sorted:");
        ArrayList<Student> sortedStudents = sortStudents();
        for (Student temp : sortedStudents) {
            System.out.println("Average Weighted grade for " + temp.getName() + " " + temp.getSurname() + " is " + calculateAVGWeightedGrade(temp));
        }
    }
    //1. Create a new function which calculates average grade for each student;

    public static float calculateAVGGrade(Student student) {
        if (student != null) {
            float sumOfGrades = 0;
            int countOfGrades = 0;
            for (Grade temp : gradeArrayList) {
                if (temp.getStudent().equals(student)) {
                    sumOfGrades = sumOfGrades + temp.getValue();
                    countOfGrades++;
                }
            }
            return sumOfGrades / countOfGrades;
        } else {
            System.err.println("Tāds students neeksistē, tāpēc nav iespējams aprēķināt vidējo atzīmi");
            return 0.0f;
        }
    }

    //2. Create a new function which calculates average grade based on course credit points (weighted average grade) for each student;
    public static float calculateAVGWeightedGrade(Student student) {
        if (student != null) {
            float sumOfGrades = 0;
            int countOfCreditPoints = 0;

            for (Grade temp : gradeArrayList) {
                if (temp.getStudent().equals(student)) {
                    sumOfGrades = sumOfGrades + temp.getValue() * temp.getCourse().getCreditPoint();
                    countOfCreditPoints = countOfCreditPoints + temp.getCourse().getCreditPoint() ;
                }
            }
            return sumOfGrades / countOfCreditPoints;
        } else {
            System.err.println("Tāds students neeksistē, tāpēc nav iespējams aprēķināt vidējo svērto atzīmi");
            return 0.0f;
        }
    }

    //3. Create a new function which calculates average grade for each course;
    public static float calculateAVGGrade(Course course) {
        if (course != null) {
            float sumOfGrades = 0;
            int countOfGrades = 0;
            for (Grade temp : gradeArrayList) {
                if (temp.getCourse().equals(course)) {
                    sumOfGrades = sumOfGrades + temp.getValue();
                    countOfGrades++;
                }
            }
            return sumOfGrades / countOfGrades;
        } else {
            System.err.println("Tāds kurss neeksistē, tāpēc nav iespējams aprēķināt vidējo atzīmi");
            return 0.0f;
        }
    }

    //4. Create a new function which calculates how many courses does professor teach;
    public static byte calculateCourseCountForProfessor(Professor professor) {
        if (professor != null) {
            float sumOfCourses = 0;
            for (Course temp : courseArrayList) {
                if (temp.getProfessor().equals(professor)) {
                    sumOfCourses++;
                }
            }
            return (byte) sumOfCourses;
        } else {
            System.err.println("Tāds pasniedzējs neeksistē, tāpēc nav iespējams aprēķināt kursa skaitu");
            return 0;
        }
    }

    public static ArrayList<Student> sortStudents(){
        //1. Pārkopēt elementus no studentu saraksta:
        ArrayList<Student> students = new ArrayList<>();
        for (Student temp: studentArrayList){
            students.add(temp);
        }
        //2. Bubble sort algoritms
        for(int i=0; i < students.size(); i++){
            for(int j = 0; j < students.size(); j++){
                float avgGradeSt1 = calculateAVGGrade(students.get(i));
                float avgGradeSt2 = calculateAVGGrade(students.get(j));
                if (avgGradeSt1 > avgGradeSt2){
                    //jāmaina vietām:
                    Student tempSt = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, tempSt);

                }
            }
        }
        //3. Atgriezt sakārtoto sarakstu
        return students;
    }


}



