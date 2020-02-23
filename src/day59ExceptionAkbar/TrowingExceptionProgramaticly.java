package day59ExceptionAkbar;

public class TrowingExceptionProgramaticly {
    public static void main(String[] args) {
        NullPointerException e1=new NullPointerException();
        NullPointerException e2=new NullPointerException("Back to earth");
        System.out.println(e2.getMessage());
        throw e2;     //you can say also throw new NullPointerException("Back to earth");
      //  System.out.println("END"); it is not compile because it is end in throw key word
//.NullPointerException: Back to earth


    }
}
