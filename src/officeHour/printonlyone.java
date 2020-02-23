package officeHour;

import java.util.Arrays;
import java.util.Scanner;

public class printonlyone {
    public static void main(String[] args) {
        System.out.println("program that can check if a string is build out of the same letters as another string");
        //		Ex: input:
       // str1 = "abc";
      //  str2 = "cba";
        //			output:true
        Scanner scan=new Scanner(System.in) ;
        System.out.println("please enter 2 words");
        String strx=scan.nextLine();
        String stry=scan.nextLine();
       String [] arr1= strx.split("");
       Arrays.sort(arr1);
        String [] arr2= stry.split("");
        Arrays.sort(arr2);
        System.out.println("*****************");
        System.out.println((Arrays.toString(arr1).contains(Arrays.toString(arr2))));


        System.out.println("============================================================");
 String str="aaabbbfffnneeessds";
        String str2="";
 for(int i=0;i<str.length();i++) {
String eachChar=str.charAt(i)+"";
if(!str2.contains(eachChar)) {
         str2 += str.charAt(i);
     }}
        System.out.println(str2);
        System.out.println("============================================================");
        System.out.println("Do it with Arrays only");
str="aaabbbfffnneeessds";
        String eachOne="";
String[] strEach=str.split("");
for(String each:strEach){
 if(eachOne.contains(each)) {
     eachOne = each + "";
 }}
        System.out.println(eachOne);
        System.out.println("============================================================");
        			String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};////	3. given the array of names:
        //	   write a program that can remove all the names named Ahmed from the array
        //	   Ex:
        //	   		names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
        //	   		System.out.println( Arrays.toString(names) );
        //	   		output:
        //	   			[John, Eric, Hassan]
        System.out.println("Write a program that will remove all the dupplicates from a string");      //   Write a program that will remove all the dupplicates from a string
String names2="";
 for(String eachNames:names) {
     if(!eachNames.equalsIgnoreCase("Ahmed")){
         names2+=eachNames+" ";
         continue;
     }}
 String [] namesChange= names2.split(" ") ;
        System.out.println(Arrays.toString(namesChange));
    String noDublicateNames="";
        for(String eachNames:names) {
  if(!noDublicateNames.contains(eachNames)) {
      noDublicateNames += eachNames + " ";

  } }String [] noDublicate=noDublicateNames.split(" ");
        System.out.println(Arrays.toString(noDublicate));

    }}





