package day04;

public class Aritmatic {
    public static void main(String[] args) {
        System.out.println(5+3); //8
        System.out.println(5-3); //2
        System.out.println(5*3); //15
        System.out.println(5/3); //1
        // aritmatic oparator between two int --->>another int
        System.out.println(5+3.0d); //8.0
        System.out.println(5-3.0d); //2.0
        System.out.println(5*3.0d); //15.0
        System.out.println(5/3.0d); //1.6666666666666667
        System.out.println(5/3.0f); //1.6666666
int num1= 5;
double num2=3.0d;
float num3=3.0f;
double result= num1+ num2;
        double result1= num1+ num2;
        double result2= num1- num2;
        double result3= num1* num2;

        double result4= num1/ num2;
        float result5 = num1/ num3;
        System.out.println(result1); //8.0
        System.out.println(result2); //2.0
        System.out.println(result3); //15.0
        System.out.println(result4); //1.6666666666666667
        System.out.println(result5); //1.6666666

}}
