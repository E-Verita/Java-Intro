package seminars6_klase.services;

import seminars6_klase.models.Student;
import seminars6_klase.models.StudyLevel;
import seminars6_klase.models.StudyProgram;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Harry");
        student1.setSurname("Potter");
        student1.setBirthday(new short[]{1990, 6, 30});
        student1.setGrades(new byte[]{8, 6, 11});
        student1.setStudyProgram(StudyProgram.Datorzinības);
        student1.setInBudget(true);
        student1.setStudyLevel(StudyLevel.Doktora);

        Student student2 = new Student("Ron", "Wheasley",new short[]{1980,5,3},new byte[]{10,8,7,3},1,true,StudyProgram.Programmēšanas_speciālists, StudyLevel.Doktora);
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        System.out.println("Tests");
    }

}
