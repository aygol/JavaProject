package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Array_List_2020 {
    public static void main(String[] args) {
        //Create a method called isNumberOnly and it accept a String object and return true
        // if all of its characters are number.
       // System.out.println(isNumberOnly("1234567"));
      //  System.out.println(isNumberOnly("1234567***"));
        //Create another method isNumberList , it accepts List<String> object and return true
        // only if all items are number only (use above method)
        String str=("80,90,40,60,90,60,40,90,100,92,96");
        String []arr=str.split(",");
        ArrayList<String> lst=new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            System.out.println(       lst.add(arr[i]) );}
     //   isNumber( lst);
    }public static boolean isNumberOnly(String str){
       int count=0;
        for(int i=0; i<str.length();i++) {
            char character = str.charAt(i);
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }}
            if (count == str.length()) {

            return true;}
       else{return false;
    }}public static boolean  isNumber(ArrayList<String> lst){
       String str1="";
        for(int i=0; i<lst.size();i++) {
            str1 += lst.get(i);
        }  return isNumberOnly(str1);

      //Integer[] nums = new Integer[] {1,4,5,7,8,5,3,2,19} ;
        //List<Integer> numsLst = Arrays.asList(new Integer[12]);
        //Integer[] numsArr = numsLst.toArray(new Integer[12]);
}}

