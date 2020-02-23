package day10;

public class Calculator {
    public static void main(String[] args) {
      char  Operator='+';
      switch (Operator){
          case '+':
              System.out.println("You are about the add numbers");
    Operator='+';
      break;
          case '-':
              System.out.println("You are about the subsract numbers");
              Operator='-';
              break;
          case '*':
              System.out.println("You are about the multibly numbers");
              Operator='*';
              break;
          case '/':
              System.out.println("You are about the divide numbers");
              Operator='/';
              break;
          default:
              System.out.println("Invalid operator!!!");
              break;
      }








    }
}
