package day48;

import java.util.Arrays;
import java.util.List;

public class HR_Action {
    public static void main(String[] args) {
        HourlyEmployee e1 = new HourlyEmployee("Subi", 102, 130, 2000);
        System.out.println(e1 + "   =e1");
        FullTimeEmployee e3 = new FullTimeEmployee("Ayse", 103, 5000);
        System.out.println(e3);
        //  Employee e4=new Employee()
    Employee e6= new HourlyEmployee("Abdurrahman", 103, 140, 2000);
        Employee e7 = new FullTimeEmployee("Ali", 109, 5000);
        System.out.println(e6+" =e6");
        System.out.println(e7+" =e7");
        List<Employee> allEmploye= Arrays.asList(e1,e6,e3,e7);
        for(Employee each:allEmploye){
           // System.out.println("each= "+each);
            System.out.println("Name is "+each.name);
         // each.calculateAnnualSalary(ea);
        }
    }}




