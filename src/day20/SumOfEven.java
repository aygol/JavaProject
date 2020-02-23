package day20;

public class SumOfEven {
    public static void main(String[] args) {
        int sumOdd=0;    int sumEven=0;
        for (int i = 10; i <=100 ; i++) {
            if(i %2==0){
                sumEven=sumEven+i;

            }else {

                sumOdd = sumOdd + i;}
            }
            System.out.println("Odd number"+sumOdd);
            System.out.println("Even number"+sumEven);
        }
    }

