package day18;

public class FizzBuzzForLoop {
    public static void main(String[] args) {

      for(int i=0; i<=100;i++) {
          if(i%5==0&& i%3==0){
              System.out.println("FizzBuzz Number! "+i);
          }
          if(i%5==0){
              System.out.println("Fizz Number "+i);
              if(i%3==0){
                  System.out.println("Buzz Number "+i);
              }
          }}}}


