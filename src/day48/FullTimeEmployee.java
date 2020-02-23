package day48;

public class FullTimeEmployee extends Employee {

//	instance fields :
double	 monthlySalary;
//Constructor : to set all the fields
//instance methods ;

    @Override
    public void calculateAnnualSalary(double monthlySalary) {

    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    public FullTimeEmployee(String name, int ID, double monthlySalary) {
        super(name, ID);
        this.monthlySalary = monthlySalary;
    }
}