package day11;

public class StringEqualllityPractice {
    public static void main(String[] args) {
        System.out.println("Java".equals("java"));
        String myStr="Java";
        System.out.println(myStr.equals("Java"));
        String yourStr=new String("Java");
        System.out.println("is my string as your string?");
        System.out.println( myStr.equals(yourStr) );
        System.out.println();
        if(myStr.equals(yourStr)) {
            System.out.println("Correct Word");

        } else
            System.out.println( "SAY JAVA!!!!!");
//update the program add moro condition
myStr=("Cava");
        if(myStr.equals("Java") ){
            System.out.println("CORRECT WORD");
        }if(myStr.equals("Cava")) {
            System.out.println("Pumpkin!!");

        }  else
            System.out.println( "NOT JAVA NOR PUMPKIN!!!!!");

        }







    }

