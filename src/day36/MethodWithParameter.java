package day36;

public class MethodWithParameter {
    public static void main(String[] args) {
   addOneHundred(25);
        addOneHundred(new Integer (100));
        int num=7;
        Integer num1=80;
        addOneHundred(num);
        addOneHundred(num1);
    }public static void addOneHundred(int x){
       // System.out.println(x+100);
        x=x+100;
        System.out.println(x);
    }
}
