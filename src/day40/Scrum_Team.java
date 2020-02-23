package day40;

public class Scrum_Team {
    public static void main(String[] args) {
        ScrumTeamploye employe1=new ScrumTeamploye();
        employe1.name="Hasan";
        employe1.jobTitle="Tester";
        employe1.salary=120000;
        employe1.employe_ID=123;
        employe1.age=32;
        employe1.standUp();
        employe1.getEmployeInfo();
        ScrumTeamploye employe2=new ScrumTeamploye();
        employe2.name="Ayse";
        employe2.salary=140000;
        employe2.employe_ID=122;
        employe2.age=43;
        employe2.getEmployeInfo();
        ScrumTeamploye employe3=new ScrumTeamploye();
        employe3.name="Ali";
        employe3.jobTitle="Developer";
        employe3.salary=220000;
        employe3.employe_ID=124;
        employe3.age=30;
        employe3.standUp();
        employe3.getEmployeInfo();

    }
}
