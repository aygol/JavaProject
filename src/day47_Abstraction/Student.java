package day47_Abstraction;

public class Student {
   int studentID;
    public Student(int studentID){
        this.studentID=studentID;
        final Student s1=new Student(101);
        s1.studentID=200;
        System.out.println(s1.studentID);
        final Student s2=new Student(102);

  //      public static final String school="Cybertek";

    }
}
