package ReplyIt;

import java.util.Scanner;

public class ReplyItVove {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for (int i = 0; i <= word.length()-1; i++) {
            char vovel = word.charAt(i);
            if (vovel == 'a' || vovel == 'e' || vovel == 'i' || vovel == 'o' || vovel == 'u') {
                System.out.print(vovel);

            }
        }


    }
}