package day55;

import java.util.List;

public class Course {
    String subject;
    List<String> studentNames;     ////String[] studentNames;  this will work but fixed in size	    List<String> studentNames;     ////String[] studentNames;
    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }
    public void addStudent(String name) {
        studentNames.add(name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}



