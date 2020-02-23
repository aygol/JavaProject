package day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>(Arrays.asList("Muge","Sumeyye","Astrit","Vlad","Zehra"));
        Course java=new Course("Java",lst) ;
        System.out.println("Java = "+java);
        java.studentNames.add("Gail");
        java.studentNames.add("Mohammed");
        java.studentNames.add("Ayjeren");
        java.studentNames.add("Ayse");
        System.out.println("Java Sutudent name ="+ java.studentNames);
        System.out.println("my orginal lst "+lst);
 //if we want to more student one shoot add all give me a collection
      java.studentNames.addAll(Arrays.asList("Serife","Furkan","Toyly"));
        System.out.println("Java before adding = "+java);
        java.addStudent("Gail");
        java.addStudent("Mohammed");
        System.out.println("Course java = "+java);
        System.out.println("java.studentNames = "+java.studentNames);


    }
}
