package Inheritance.model;

public class Student extends Person{
    private long st_id;
    private static long counter = 10000;
   // 1. variables - name un surname nāk no Person

    public long getSt_id() {
        return st_id;
    }
    public void setId() {
        this.st_id = counter;
        counter++;
    }

    public static long getCounter() {
        return counter;
    }

    // getters&setters  - setName + setSurname nāk no Person

    //3. constructor

    public Student(){
        super();  // tiek izsaukts bāzes konstruktors - bezargumenta konstruktors Person()
        setId();
    }

    public Student (String name, String surname){
        super(name, surname);
        setId();
    }

   /* @Override
    public String toString() {
        return "Student{" +  "st_id=" + st_id + ", name=" + super.getName() + ", surname=" + super.getSurname() + '}';
    }*/


    @Override
    public String toString() {
        return "Student{" +  "st_id=" + st_id + super.toString() + '}';
    }

}
