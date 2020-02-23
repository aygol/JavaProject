package day36;

public class WrapperClassesReview {
    public static void main(String[] args) {
        Integer i1=new Integer(1000000000);
        Integer i2=Integer.valueOf(123);
        Integer i3=45;//it in the heap
        int i4=54;//it in the stack
        Integer j1=122;
        Integer j2=300;
        printTheDoubleTheValue(10);
        printTheDoubleTheValue(j1);
        sumandPrint(j1,j2);
        sumandPrint(12,30);
        sumandPrint(new Integer(23),new Integer(10));
    }public static void sumandPrint(Integer num1,Integer num2){
        System.out.println(num1+num2);
    }public static void printTheDoubleTheValue(int x){
        System.out.println("after doubling x "+(x*2));
    }

}
