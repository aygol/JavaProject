package day21;

public class TaskWakeUp {
    public static void main(String[] args) {
       String myName="Ayse";
       String yourName="";
      for(int i=0; i<=myName.length()-1;i++) {
          System.out.print(myName.substring(i, i + 1)+""+">-");
          System.out.println(myName.substring(i, i + 2)+""+">-");


      }
    }
}
