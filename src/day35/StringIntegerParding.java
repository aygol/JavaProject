package day35;

public class StringIntegerParding {
    public static void main(String[] args) {
    String strNum="100";
    int num=Integer.parseInt(strNum);
        System.out.println("num = "+ num);
   String empID="FB-457";
  int id=Integer.parseInt(empID.split("-")[1]);
  //second way



 String twoNumbers="100,600" ;
 //I want you to add them give the result
 int sum =Integer.parseInt(twoNumbers.split(",")[0])+ Integer.parseInt(twoNumbers.split(",")[1]) ;

        System.out.println(sum);

    }
}
