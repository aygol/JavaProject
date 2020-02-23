package ReplyIt;

import java.util.Scanner;

public class ReplyItArrayKarsilastirTekOlaniPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int count=0;
        for(int i : nums){
            for(int j : nums){
                if(i==j){
                    count++;
                }

            }
            if(count<2){
                System.out.println(i);

            }
            count=0;
        }

    }
}








