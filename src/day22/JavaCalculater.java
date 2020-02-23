package day22;

public class JavaCalculater {
    public static void main(String[] args) {
      int multiple=1;
        for(int i=1;i<=12;i++){
            System.out.println("-------------------");

            for(int j=1;j<=12;j++){

                multiple=i*j;

                System.out.println(i+" X "+j+" = "+multiple);

            }
        }
    }
}
