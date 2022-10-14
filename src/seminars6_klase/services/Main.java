package seminars6_klase.services;

import seminars6_klase.models.Student;
import seminars6_klase.models.StudyLevel;
import seminars6_klase.models.StudyProgram;
import seminars6_klase.models.Subject;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Servisā izveidot priekšmetus, tos izprintēt
        Subject subject1 = new Subject("JAVA Intro", "Karina", (byte) 4, StudyProgram.Programmēšanas_speciālists);
        Subject subject2 = new Subject("Python", "Estere", (byte) 4, StudyProgram.Programmēšanas_speciālists);
        Subject subject3 = new Subject("Mathematics ", "Karina", (byte) 8, StudyProgram.Programmēšanas_speciālists);
        Subject subject4 = new Subject("English 2", "Janis", (byte) 2, StudyProgram.Programmēšanas_speciālists);
        Subject subject5 = new Subject("Economics", "Sara", (byte) 2, StudyProgram.Ekonomika);
        Subject subject6 = new Subject("Business studies", "Adam", (byte) 6, StudyProgram.Ekonomika);
        Subject subject7 = new Subject("Project Management", "Aivars", (byte) 2, StudyProgram.Programmēšanas_speciālists);

        Subject [] subjects = {subject1,subject2,subject3,subject4,subject5,subject6,subject7};
        System.out.println("PRIEKŠMETI: ");
        for (Subject temp: subjects){
            System.out.println(temp);
        }
        System.out.println("\n----------------------------------------------------------------------");


        //Izveidot studentus, tos izprintē
        Student stud1 = new Student();
        Student stud2 = new Student("James", "Potter", new short[]{1950, 5, 4}, new byte[]{10,9,5,8}, 1, true, StudyProgram.Programmēšanas_speciālists, StudyLevel.Pirmā_Līmeņa_Augstākā,
                new Subject[]{subject4,subject1,subject2 });
        Student stud3 = new Student("Lilly", "Potter", new short[]{1949,6,6}, new byte[]{10,9,5,8}, 2, true,StudyProgram.Ekonomika, StudyLevel.Pirmā_Līmeņa_Augstākā);
        Student stud4 = new Student("John", "Oliver", new short[]{1949,7,7}, new byte[]{10,9,9,8}, 3, true,StudyProgram.Programmēšanas_speciālists, StudyLevel.Pirmā_Līmeņa_Augstākā);
        Student stud5 = new Student("Sirius", "Black",new short[]{1949,7,7}, new byte[]{10,9,7,8}, 3, true,StudyProgram.Programmēšanas_speciālists, StudyLevel.Pirmā_Līmeņa_Augstākā);

        //todo: ievieto visus izveidotos studentus masīvā
        Student [] students = {stud1, stud2, stud3, stud4, stud5};
        System.out.println("STUDENTI:");
        for (Student temp: students){
            System.out.println(temp);
        }
        System.out.println("\n----------------------------------------------------------------------");

        //todo:atrast visus studentus, kuri macās Programmēšanas speciālists
        for (Student temp : students){
            if (temp.getStudyProgram().equals(StudyProgram.Programmēšanas_speciālists)){
                System.out.println(temp.getName() + " mācās par Programmēšanas speciālistu");
            }
        }
        System.out.println("\n----------------------------------------------------------------------");


        //todo:atrast visus studentus, kuru vidējā atzīme ir virs 8
        for (Student temp : students){
            int gradesSum= 0;
            float count = 0;
            byte[] grades = temp.getGrades();
            for (byte tempgrade: grades ){
                gradesSum+=tempgrade;
                count++;
            }
            float average = gradesSum/count;
            if (average>=8) {
                System.out.println(temp.getName() + " vidējā atzīme ir " + average + ", kas ir 8 vai augstāk.");
            }
        }







    }


}
