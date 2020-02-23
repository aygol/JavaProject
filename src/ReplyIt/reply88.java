package ReplyIt;

import java.util.Scanner;

public class reply88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        for (int i = 0; i < word.length()-2; i++)
        {
            if (word.charAt(i)== 'c' && word.charAt(i+1)== 'a' && word.charAt(i+2)== 't')
            {
                countOfCats++;
            }

            else if(word.charAt(i) == 'd' && word.charAt(i+1)== 'o' && word.charAt(i+2)== 'g')
            {
                countOfDogs++;
            }

        }

        if (countOfCats == countOfDogs) {
            System.out.println("true");

        } else{
            System.out.println("false");   }
}}
