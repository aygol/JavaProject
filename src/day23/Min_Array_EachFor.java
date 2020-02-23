package day23;

public class Min_Array_EachFor {
    public static void main(String[] args) {
        long salaries[]=new long[]{13000L,4310000L,43000000L,13440000L,19800000L};

        long minSalary=salaries[0];
        for (long salary : salaries) {
            if(salary<minSalary){
                minSalary=salary;
            }

        }
        System.out.println("min Salary = "+minSalary);

    }
}
