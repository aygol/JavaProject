package officeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {
    String schoolName;
    List<Student> allStudentsList;  //=new ArrayList<>();
    public School(String schoolName, List<Student> list) {
        this.schoolName = schoolName;
        this.allStudentsList = list;
    }public void addNewStudent(String studentName) {
        Student s1 = new Student(studentName);
       this. allStudentsList.add(s1);
    }public void addNewStudent(Student [] student) {

        this.allStudentsList.addAll(Arrays.asList(student));
    }
    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", allStudentsList=" + allStudentsList +
                '}';
    }
}



