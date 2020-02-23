package officeHour;

public class Testers extends ScrumTeam {

    public Testers(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public String employeeInfo() {
        return super.employeeInfo();
    }

    public void foundBug(){
        System.out.println("The bug found in the website");
    }

    @Override
    public void Demo() {
        System.out.println("Tester have Demo after every sprint ");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Development team has stand up meeting every day at 9:30 AM.");

    }
//actions: foundBug()
}
