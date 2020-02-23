package officeHour;

public class Student {
    String studentName;
   public  Student(String studentName){
       this.studentName=studentName;
   }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
    }
//Task1:
    //	create a class called Student:
    //			instance variables: String studentName
    //			initialize the ins variable within a constructor
    //	create a class called School:
    //			instance variables: String schoolName
    //								List<Student> AllStudentsList;
    //			initialize instance variables within a constrcutor
    //			create a method called addNewStudent() that can add students to the AllStudentsList
    //	create a class called AssociationExample:
    //			create 5 objects of the students class
    //			creata a List of students called CybertekStudents and store those 5 objects into the List
    //			create the object of the School and initialize school name to "Cybertek"
    //			add two more new students "Denis" and "Irina" to cybertek school' student list
    //			use for each loop to print out entire cybertek student' names
    //Task2:
    //	create a class called circle:
    //			instance variables: radious
    //			override equals() method:
    //					returns true if the one circule' radius is same with another circle
    //	create a class called Test:
    //			create two objects of circle, one' radious is 3, the other' radius is 5
    //			verify if those two circles are equal
}
