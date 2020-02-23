package day23;

public class Max_Array {
    public static void main(String[] args) {
        long salaries[]=new long[]{13000L,4310000L,43000000L,13440000L,19800000L};

   long maxSalary=salaries[0];//              int max =nums[0]  int numbers:nums    if(numbers>max) max=numbers
        for (long salary : salaries) {
            if(salary>maxSalary){
                maxSalary=salary;
            }

        }
        System.out.println("maxSalary = "+maxSalary);




    }
}
