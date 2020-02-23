package aTekrar;

public class SwapNumber {
   public static void swapWitoutTemp(int a,int b) {
       System.out.println("Before swap  a= "+a+" b= "+b);
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("After swap a= "+a+" b= "+b);
   } public static void swapWitoutTempMultiplaying(int a,int b) {
        System.out.println("Before swap  a= " + a + " b= " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swap a= " + a + " b= " + b);
    }  public static void swapWitoutTemp(int a,int b,int c) {
        System.out.println("Before swap  a= " + a + " b= " + b + " c= " + c);
        a = a + b + c;//10;20;30=60
        b = a - (c + b);//b=a//60-50=10
        c = a - (c + b);//c=b//60-(30+10)=20
        a = a - (c+ b);//a=c//60(
        System.out.println("After swap  a= " + a + " b= " + b + " c= " + c);
    }
    public static void main(String[] args) {
        swapWitoutTemp(12,9);
        swapWitoutTemp(13,-9);
        //swapWitoutTempMultiplaying(0,100);
      //  swapWitoutTempMultiplaying(120,0);
        swapWitoutTempMultiplaying(12,8);
        swapWitoutTemp(2147483647,2147483647);
        swapWitoutTemp(12,40,100);
    }

}
