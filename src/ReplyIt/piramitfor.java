package ReplyIt;

import org.w3c.dom.ls.LSOutput;

public class piramitfor {
    public static void main(String[] args) {


       int rows = 5;
        int space=rows-1;
  for (int i = 1; i <= rows; ++i) {
        for(int j = 1; j <= i; ++j) {
            System.out.print(space+j + " ");
        }
        System.out.println();
    }
}}



