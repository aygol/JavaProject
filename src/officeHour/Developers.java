package officeHour;

public class Developers extends ScrumTeam{
    String jobTitle="software developer";

    public Developers(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public String employeeInfo() {
        return super.employeeInfo();
    }

    //job title by default should be software developer
    //    //						actions: fixingBug()
   public void fixingBug() {
       System.out.println("The bug fixed by developers");
   }

    @Override
    public void Demo() {
        System.out.println("Developer have Demo after every sprint ");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Developer have stund up meeting very morning 9:30 AM. ");
    }
}
