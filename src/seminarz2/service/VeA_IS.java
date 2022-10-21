package seminarz2.service;

import seminarz2.model.Course;
import seminarz2.model.Grade;
import seminarz2.model.Professor;
import seminarz2.model.Student;

import java.util.ArrayList;

public class VeA_IS {
    public static void main(String[] args) {

        // PROFESORI
        Professor prof_kar = new Professor("Karina", "Skirmante", "Doctor");
        Professor prof_and = new Professor("Andis", "Pilans", "Doctor");
        Professor prof_est = new Professor("Estere", "Vitola", "Doctor");
        Professor prof_uld = new Professor("Uldis", "Kuplis", "Doctor");

        ArrayList<Professor> professorList = new ArrayList<>();
        professorList.add(prof_kar);
        professorList.add(prof_and);
        professorList.add(prof_est);
        professorList.add(prof_uld);


        // STUDENTI
        Student st_ev = new Student("Everita","Vecberza");
        Student st_av = new Student("Andris","Vitols");
        Student st_ee = new Student("Egils","Egle");
        Student st_ao = new Student("Armands","Osis");

        ArrayList<Student>studentArrayList = new ArrayList<>();
        studentArrayList.add(st_ev);
        studentArrayList.add(st_av);
        studentArrayList.add(st_ee);
        studentArrayList.add(st_ao);

        // COURSES
        Course course1 = new Course("Java", 4, prof_kar);
        Course course2 = new Course("IT Standards", 2, prof_and );
        Course course3 = new Course("Python", 4, prof_est);
        Course course4 = new Course("IT Prtoject Management", 4, prof_uld);

        ArrayList<Course> courseArrayList = new ArrayList<>();
        courseArrayList.add(course1);
        courseArrayList.add(course2);
        courseArrayList.add(course3);
        courseArrayList.add(course4);

        //GRADES
        Grade grade_ev1 = new Grade(10,st_ev,course1);
        Grade grade_ev2 = new Grade(8,st_ev,course2);
        Grade grade_ev3 = new Grade(4,st_ev,course3);
        Grade grade_ev4 = new Grade(9,st_ev,course4);

        Grade grade_av1 = new Grade(7,st_ev,course1);
        Grade grade_av2 = new Grade(8,st_ev,course2);
        Grade grade_av3 = new Grade(9,st_ev,course3);
        Grade grade_av4 = new Grade(10,st_ev,course4);

        Grade grade_ee1 = new Grade(4,st_ev,course1);
        Grade grade_ee2 = new Grade(6,st_ev,course2);
        Grade grade_ee3 = new Grade(4,st_ev,course3);
        Grade grade_ee4 = new Grade(5,st_ev,course4);

        Grade grade_ao1 = new Grade(10,st_ev,course1);
        Grade grade_ao2 = new Grade(8,st_ev,course2);
        Grade grade_ao3 = new Grade(10,st_ev,course3);
        Grade grade_ao4 = new Grade(10,st_ev,course4);


        ArrayList<Grade>gradeArrayList = new ArrayList<>();
        gradeArrayList.add(grade_ev1);
        gradeArrayList.add(grade_ev2);
        gradeArrayList.add(grade_ev3);
        gradeArrayList.add(grade_ev4);
        gradeArrayList.add(grade_av1);
        gradeArrayList.add(grade_av2);
        gradeArrayList.add(grade_av3);
        gradeArrayList.add(grade_av4);
        gradeArrayList.add(grade_ee1);
        gradeArrayList.add(grade_ee2);
        gradeArrayList.add(grade_ee3);
        gradeArrayList.add(grade_ee4);
        gradeArrayList.add(grade_ao1);
        gradeArrayList.add(grade_ao2);
        gradeArrayList.add(grade_ao3);
        gradeArrayList.add(grade_ao4);


        // PRINT

        System.out.println(professorList);
        System.out.println(studentArrayList);
        System.out.println(courseArrayList);
        System.out.println(gradeArrayList);

    }
}
