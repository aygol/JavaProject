package ReplyIt;

import java.util.Arrays;
import java.util.Scanner;

public class replyArray {
    public static void main(String[] args) {
      //  Write a program that will find out shortest words in the given string str.
        //  If there are few words that are evenly short, print them all.
        //  Use split method in order to split str string variable and create an array of strings.
        //  Print array with Arrays.toString() method. Sort array before printing.
        //Split values by comma: split(", ");
       // input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
      //  output: [cat, old, ray]
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String []str1   = str.split(",");
        Arrays.sort(str1);
    int    count=0;
        String shordest=str1[0];
for(int i=0; i<str1.length;i++){
    if(str1[0].length()==str1[i].length()) {
       shordest=str1[i] ;
        count++;}
    String[] arr2=new String [count];

        System.out.println(Arrays.toString(arr2));


    }

    }}

