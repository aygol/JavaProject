package day32;

public class MEthodWIthReturnIntro {
    public static void main(String[] args) {
        System.out.println("return " + giveMeMyName());
        String myName = giveMeMyName();
        System.out.println("name " + myName);
        System.out.println(doubleTheNumber(50));
 int myresult=doubleTheNumber(40);
 System.out.println("my result ="+myresult);
 int add14to16REsult=add2Numbers(14,16);
        System.out.println(" add 14 to 16 REsult = "+add14to16REsult);
        System.out.println(add2Numbers(14,16));
        System.out.println("adding 5 "+add2Numbers(14,16)+5);
    }

    //create methid callef giveMeMyName
    public static String giveMeMyName() {
//String myName="Ayse";
        return "Ayse";
    }

    public static int doubleTheNumber(int num) {
        int result = num * 2;
        return result;

    }  public static int add2Numbers(int num1,int num2) {
     //return sum
        return num1+num2;}




}
