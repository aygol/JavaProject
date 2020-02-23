package homeWork;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class TaskArray2 {
    public static void main(String[] args) {
        //Create a String array of 6 items to store groceryItems
        //{"apple","banana","grape","strawberry","blueberry","kiwi"}
        //Create a float array of 6 float values to store prices
        //{ 1.99,   0.99,    4,65,    3.89,       3.88,      2.88  }
        //assume that the order of grocery Items match the prices in same order.
        //Do below tasks :
        //1, loop through each grocery items and print them in one line
        //          1.1 print each items at odd index
        //          1.2 print all items in reverse order
        //          1.3 find out the index location of strawberry
        //          1.4 find out the count of groceries that contains berry in the name
        //          1.5 print out all the character counts of the grocery items
        //          1.6 print out only those items with even character count
        //          1.7 print out only those items end with letter e
        //          1.8 print out only last 3 characters of all the items
        //          1.9 create String variable called allItems and store all the items inside array separated by comma.
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4, 65f, 3.89f, 3.88f, 2.88f};
int groceryLength=6;
      int  berryCount=0;
        for (int i = 0; i <groceryLength; i++) {
            if (i % 2 == 0) {
                System.out.println("each items at (odd index)  " + i + "= " + groceryItems[i]);
            }}
        System.out.println();
        for (int i = groceryLength-1; i <= 0; i--) {
            System.out.println("print all items in reverse order " + groceryItems[i]);
        }
        System.out.println();
           for (int j = 0; j < groceryLength; j++ ){
            if (groceryItems [j].equalsIgnoreCase("strawberry")) {
                System.out.println("the index location of strawberry " + j);
            }
        }
        System.out.println();
            for(int i = 0; i < groceryLength; i++ ){
        if (groceryItems[i].contains("berry")) {
                    berryCount++;
                } }
        System.out.println("*******");
            System.out.println("the count of groceries that contains berry in the name "+berryCount);
    for(int i =0; i<groceryLength; i++){
        System.out.println(" the character counts of the grocery items "+i+" = "+ groceryItems[i].length());
if(groceryItems[i].length()%2==0) {
    System.out.println("*******");
    System.out.println("  only those items with even character count " + i + " = " + groceryItems[i].length());
} }   for(int i =0; i<groceryLength; i++){
            if (groceryItems [i].endsWith("e")){
                System.out.println("only those items end with letter e "+ groceryItems[i]);
            }
        }
        System.out.println("********");
        for(int i =0; i<groceryLength; i++) {
            System.out.println("only last 3 characters of all the items = " + groceryItems[i].substring(groceryItems[i].length()-3, groceryItems[i].length()));




        }
        System.out.println("*******");

         String  allItems= Arrays.toString(groceryItems);
        System.out.println(allItems);
    }
}