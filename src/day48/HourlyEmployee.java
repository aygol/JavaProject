package day48;

public class HourlyEmployee extends Employee {


   double hourlyWage;
   int numsOfHours;
//   String name;
//   int ID;



    public HourlyEmployee(String name, int ID, double hourlyWage, int numsOfHours) {
        super(name, ID);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }

    @Override
    public void calculateAnnualSalary(double monthlySalary) {
        System.out.println(monthlySalary*12);
    }


    //public double calculateAnnualSalary(){
 //  return ( hourlyWage*numsOfHours*30)*12;
 //  }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}

////	hourlyWage , numsOfHours ,
////Constructor : to set all the fields
////instance methods ;
////	calculateAnualSalary
////	toString