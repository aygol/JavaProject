package day59ExceptionAkbar;

public class General {
    public static void main(String[] args) {


        //   System.out.println(o.charAt(0)); it is not compile
       String str=null;
       String str1="";
      // System.out.println(str.charAt(0));//null   java.lang.NullPointerException
        try{
            System.out.println(str.charAt(0));
            System.out.println(str1.charAt(0));
            System.out.println("END OF TRY");
    }catch(NullPointerException bla){
            System.out.println("No object here");
        }catch(Exception e){
            System.out.println("This is the rest of exceptions");
        }
        System.out.println("The end");



}}
