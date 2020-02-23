package array_practice;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String name= "Alesya";
        char []nameChars=new char[name.length()];

   for (int x=0; x<nameChars.length;x++){
       nameChars[x]=name.charAt(x);
       System.out.println(nameChars[x]);
   }

        System.out.println("namesChars= "+ Arrays.toString(nameChars));
    }
}
