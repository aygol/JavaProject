package day58Exception;

public class TryCatcgFinally {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try{
            System.out.println("Hello from try Block");
            String str=null;//null pointer exception
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println("Exception happened and caught");
        }finally{
            System.out.println("Finally block. runs if there is exception or no exception");
        }
  //      System.out.println("after try catch");
    }
}
