package ReplyIt;

import java.util.Scanner;

public class Reply150 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main
    public static void plus_minus(int arr[]){
        int countZeros=0;
        int  negatives=0;
        int  positives=0;
        for(int i=0;i<arr.length;i++) {

            if(arr[i]==0){
                countZeros++;

            }  else  if(arr[i]<0){
                negatives++;
            } else  if(arr[i]>0)  {
                positives++;
            }
        }System.out.println("positives:"+positives+","+" negatives:"+negatives+","+" zeros:"+countZeros);
    }


}

















