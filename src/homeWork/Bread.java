package homeWork;

import java.util.Scanner;

public class Bread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
String str1="";

        if(str.length()<=10) {
            System.out.println("nothing");

        }else if(!str.contains("bread")){
            System.out.println("nothing");

        }else if     (str.contains(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")))){
            System.out.println(str1 = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));}}}




