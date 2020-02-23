package day19;

public class FindingTheCountingSomething {
    public static void main(String[] args) {
        //from 1-100 count how many numbers can be diveded by 15*print out all the numbers without remeinder
int counter=0;
      for(int i=1; i<=100; i++) {
          if(i%15==0){
              counter=counter+1;//++counter;
              System.out.println(i+" ");
          }
      }
        System.out.println("counter "+counter);


    }
}
