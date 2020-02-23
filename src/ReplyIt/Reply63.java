package ReplyIt;

import java.util.Scanner;

public class Reply63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()%2!=0&&word.length()>=3){

            System.out.println(word.substring(word.length()/2,word.length()/2+1));
        } else if(word.length()==1){
            System.out.println(word.charAt(0)+""+word.charAt(0));
        }else if(word.length()%2==0&&word.length()>=4){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }else if(word.length()==2){
            System.out.println(word.charAt(0)+""+word.charAt(1)+word.charAt(0)+""+word.charAt(1));
        }




    }
}
