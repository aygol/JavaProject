package day40;

public class ScrumTeamploye {

    String jobTitle;
    String name;
    double salary;
    int employe_ID;
    int age;

    public void standUp(){
        System.out.println("This team make a stand up meeting at 10:40 AM ");
    }public void getEmployeInfo(){
        System.out.println("Employe name " +name+" age "+age+" jobTitle "+jobTitle+" employe_ID : "+employe_ID+
                " salary $"+salary);
    }
}
