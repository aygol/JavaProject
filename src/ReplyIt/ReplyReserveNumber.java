package ReplyIt;

import java.util.Scanner;

public class ReplyReserveNumber {  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    isPalindrome(num);

}

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int reverse=0;
        boolean isPalindrome=false;
        int reminder=0;
        do{ reminder+=num%10;
            reverse=reverse*10+reminder;
            num=num/10;
        }while(num>0);
        if (num==reverse){
            isPalindrome=true;

        }
    }}

