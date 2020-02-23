package homeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
  //Given a String with any possible length including 0
        //        print first 2 characters only if the String has more than 1 character
        //        if the String is empty print Empty String
        //else print the first char twice in same Link
        //        for example :
        //        "abcde" --> ab
        //        ""        --> empty String
        //        "J"       --> JJ
        System.out.println("Please enter name");
   String name=scan.nextLine();
if(name.length()>0) {
    System.out.println(name.charAt(0)+"" + name.charAt(1));//System.out.println(text.substring(0, 2));
}else if(name.isEmpty()){
            System.out.println("Empty String");
        }
else{
    System.out.println(name.charAt(0)+name.charAt(0));
}


    }
}
