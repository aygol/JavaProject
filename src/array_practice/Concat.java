package array_practice;

public class Concat {
    public static void main(String[] args) {
   String ta="A " ;
   ta=ta.concat("B ");
   String tb="C ";
   ta=ta.concat(tb);
   ta.replace("C","D");
   System.out.println(ta);
   ta=ta.concat(tb);
   System.out.println(ta);
    }
}
