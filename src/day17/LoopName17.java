package day17;

public class LoopName17 {
    public static void main(String[] args) {

        //skipp counting by 3 from 0 till 30
        //   int counter=0;
        //   while(counter<30){
        //       counter+=3;
        //     System.out.println(counter+" ");
      //  int num = 0;


    //    while (num < 50) {
   //         num += 2;
     //       System.out.println(num);
     //       System.out.println("-------------------");
       // }
     //   int num1=1;
    //    while(num1<=50){
      //      System.out.println(num1+" ");
      //      num1+=2;
      //  }
        int cnt=0;
        while(cnt<=50){
            if(cnt%2==0){
                System.out.println(cnt+" " +"even number");
            }else
                System.out.println(cnt+" "+"odd number");

          ++ cnt;   }

    }}

