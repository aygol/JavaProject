package day58Exception;

public class RunTimeErrorDemo {

    //compile errors normaly due to programs mistake regarding sntax , data typesetc,
    //During runtime
    //--> error happenes do to enviroment issues we do not handle them
    //during runtime Checked Exceptions -->are exceptions that programmer must handle other wise code
    //StackOverflowERROR                      OutOfMemoryError
  static int num=0;

    public static void main(String[] args) {
    num++;
        System.out.println("num "+num);
    //    main(null);
    }
}
