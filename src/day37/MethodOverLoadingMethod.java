package day37;

public class MethodOverLoadingMethod {
    public static void main(String[] args) {
  printNum(100);
  printNum(Integer.valueOf(120));
  }public static void printNum (int x){
        System.out.println("int = "+x);

    }public static void printNum (Integer x){
        System.out.println("Integer = "+x);
}
}