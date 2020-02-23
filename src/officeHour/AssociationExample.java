package officeHour;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class AssociationExample {
    public static void main(String[] args) {
        //create 5 objects of the students class
        //    //			creata a List of students called CybertekStudents and store those 5 objects into the List
        //    //			create the object of the School and initialize school name to "Cybertek"
        //    //			add two more new students "Denis" and "Irina" to cybertek school' student list
        //    //			use for each loop to print out entire cybertek student' names

// List<String> list=  Arrays.asList("A","B","C","D","E");
        Student s1 = new Student("Ayse");
        Student s2 = new Student("Ali");
        Student s3 = new Student("Ahmet");
        Student s4 = new Student("Serife");
        Student s5 = new Student("Furkan");
        List<Student>CybertekStudents = Arrays.asList(s1,s2,s3,s4,s5);
        School cybertek=new School("Cybertek",CybertekStudents);
        cybertek.addNewStudent("Irina");
        cybertek.addNewStudent("Melek");
       for(Student eachStudent:cybertek.allStudentsList)//statdy

        System.out.println(cybertek.allStudentsList);

        System.out.println(cybertek.schoolName);
            }


    }

