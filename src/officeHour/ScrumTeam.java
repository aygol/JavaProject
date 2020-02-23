package officeHour;

public abstract class ScrumTeam {
    String name;
    String jobTitle;
    double salary;
    public ScrumTeam(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void Demo();
    public abstract void DailyStandUp();
    public String employeeInfo(){
       this.name=name;
       this .jobTitle=jobTitle;
       this.salary=salary;
       return "Employee name "+name+" jobTitle "+jobTitle+" salary = "+salary;

    }
}
