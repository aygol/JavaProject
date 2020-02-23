package ReplyIt;

import java.util.Scanner;

public class Reply153 {

    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            String s = inp.next();
            person(s) ;
        }

        public static void person(String info)
        {String arr[]= info.split(",");
            String person="person name: "+arr[0]+" last name: "+arr[1]+ " age: "+ arr[2];
            System.out.println(person);
            //your code here


        }//end person

    }

