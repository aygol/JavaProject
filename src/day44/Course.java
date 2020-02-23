package day44;

public class Course {
    String name;
    String type;
static int counter;
    public Course(String name, String type) {//this is constractor
        this.name = name;
        this.type = type;
        counter++;
    }
}
