package homeWork;

import java.util.Scanner;

public class ReplyFactoriel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result=1;
        for(int i=1 ; i<=n ; i++ ) {
             result*=i; //1*2*3*4*55

        } System.out.println(result);

    }}
