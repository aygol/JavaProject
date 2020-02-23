package ReplyIt;

import java.util.Arrays;
import java.util.Scanner;

public class ZombiAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int day=0;
        int sum;
        do {
            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
            ++day;
            sum=0;
            for (int i=0; i<inhabitants.length; i++) {
                inhabitants[i] /= 2;
                sum += inhabitants[i];
            }
        } while (sum>0);

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
    }
}
