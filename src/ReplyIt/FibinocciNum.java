package ReplyIt;

import java.util.Scanner;

public class FibinocciNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int finNum1 =0;
        int finNum2=1;
        int sum=0;
        int n=2;
        if(num==1){
            sum=0;
            System.out.println(sum);
        } else if(num==2){
            sum=1;
            System.out.println(sum);
        }else {

            while(num>=n){
                sum=finNum1+finNum2;
                finNum1=finNum2;
                finNum2=sum;
                n++;

            }System.out.println(sum);

        }

    }
}

