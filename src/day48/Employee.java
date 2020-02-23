package day48;

public abstract class Employee  {


    String name;
    int ID;
public Employee(){

}
    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void calculateAnnualSalary(double  monthlySalary);
      //  return (monthlySalary*12);





    public abstract String toString() ;

    }


//Constructor : to set all the fields
//abstract methods :
//		calculateAnualSalary
//		toString
