package method_Practice;

public class Method_Calls {
    public static void main(String[] args) {

    }public static void method1(){
        System.out.println("A");
    }public static void method2() {
    method1();
    System.out.println("A");
}public static void method3(){
    method2();
        System.out.println("C");

}public static int max(int a,int b) {
        return (a > b) ? a : b;
    }public static int max(int a,int b,int c) {
        int largestNum=max(a,b);
        return (max(a,b)>c) ? max(a , b):c;
    }}
