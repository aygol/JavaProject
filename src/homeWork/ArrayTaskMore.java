package homeWork;

import java.util.Arrays;

public class ArrayTaskMore {
    public static void main(String[] args) {
   //Arrays.toString(yourArray);
        //Arrays.sort(yourArray);
        //Arrays.equals(yourArray,myArray);
        //Arrays.copyOf(yourArray, 4);
        //// optionally
        //Arrays.copyOfRange(yourArray,1,4);
        //Arrays.binarySearch(yourArray,3);
  String [] yourArray={"monday","Thusday","Friday","Friday","sunday"} ;
        Arrays.toString(yourArray);
        System.out.println(Arrays.toString(yourArray));
        Arrays.sort(yourArray);
        Arrays.toString(yourArray);
        System.out.println("After sorted "+Arrays.toString(yourArray));
String [] myArray={""};
        Arrays.equals(yourArray,myArray);

        System.out.println("Arrays.equals(yourArray,myArray "+Arrays.equals(yourArray,myArray));
        String [] yourArray1={"monday","Thusday","Friday","Friday","sunday","Wendisday"} ;

        Arrays.copyOf(yourArray1, 4);
        String[] copyyourArray=new String [4] ;
        System.out.println("Arrays.copyOf(yourArray, 4); "+Arrays.toString(yourArray));
        Arrays.binarySearch(yourArray,3);
        System.out.println("Arrays.binarySearch(yourArray1,3); "+Arrays.equals(yourArray,myArray));
    }
}