package homeWork;

public class ArrayItemPrice {
    public static void main(String[] args) {
/*
          Create a String array of 6 items to store groceryItems
          {"apple","banana","grape","strawberry","blueberry","kiwi"}
          Create a float array of 6 float values to store prices
          { 1.99,   0.99,    4,65,    3.89,       3.88,      2.88  }
          assume that the order of grocery Items match the prices in same order.
          Do below tasks :
      +    1, loop through each grocery items and print them in one line
      +    1.1 print each items at odd index
      +    1.2 print all items in reverse order
      +    1.3 find out the index location of strawberry
      +    1.4 find out the count of groceries that contains berry in the name
      +    1.5 print out all the character counts of the grocery items
      +    1.6 print out only those items with even character count
      +    1.7 print out only those items end with letter e
      +    1.8 print out only last 3 characters of all the items
      +    1.9 create String variable called allItems and store all the items inside array separated by comma.
 */
                String[] groceryitems = new String[] {"apple","banana","grape","strawberry","blueberry","kiwi"};
                float[] prices = new float[]  { 1.99f, 0.99f, 4,65f, 3.89f, 3.88f, 2.88f };
                int countOfBerry = 0;
                String allItems = "";
                for (int index = 0; index < groceryitems.length ; index++) {
                    String eachItems = groceryitems[index];
                    System.out.print(eachItems + " ");
                }
                System.out.println();
                for (int index = 0; index < groceryitems.length ; index++) {
                    if (index%2==1) {
                        System.out.print( groceryitems[index] + " ");
                    }
                }
                System.out.println();
                for (int index = groceryitems.length-1; index >=0 ; index--) {
                    System.out.print(groceryitems[index] + " ");
                }
                System.out.println();
                for (int index = 0; index < groceryitems.length ; index++) {
                    if (groceryitems[index].equalsIgnoreCase("strawberry")) {
                        System.out.println("The index of strawberry is " + index);
                    }
                }
                System.out.println();
                for (int index = 0; index < groceryitems.length ; index++) {
                    if(groceryitems[index].contains("berry")) {
                        countOfBerry++;
                    }
                }
                System.out.print("Count of berry is " + countOfBerry);
                System.out.println();
                for (int index = 0; index < groceryitems.length ; index++) {
                    System.out.print(groceryitems[index]+ " " +groceryitems[index].length() + ", ");
                }
                System.out.println();
                for (int index = 0; index < groceryitems.length ; index++) {
                    if(groceryitems[index].length()%2==0) {
                        System.out.println(groceryitems[index] + ", ");
                    }
                }
                System.out.println();
                for (int index = 0; index < groceryitems.length ; index++) {
                    if (groceryitems[index].endsWith("e")) {
                        System.out.print(groceryitems[index] + ", ");
                    }
                }
                System.out.println();
                for (int index = 0; index < groceryitems.length ; index++) {
                    System.out.print(groceryitems[index].substring(groceryitems[index].length()-3 ) + ", ");
                }
                System.out.println();
                for (int index = 0; index < groceryitems.length ; index++) {
                    allItems=allItems+groceryitems[index]+", ";
                }
                System.out.println(allItems);
            }
        }



