package homeWork;

public class MallShoping {
    public static void main(String[] args) {


        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
                //TASK 1. Check if all 3 arrays are exact same length
                //Print "All arrays are equal length"
        if(items.length==prices.length&&items.length==itemIDs.length) {
            System.out.println("All arrays are equal length");
        }
        //        //TASK 2. Print how many items purchased
        //        //System.out.println("Items count: " + ??);
        int itemsCount=items.length;
        System.out.println("Items count: " +itemsCount);
        //        //TASK 3. Print a receipt report.
        //        /*
        //            12345 - Shoes - $99.99
        //            ...
        //            458.8 * 0.06 + 458.8
        //            Total price: $458.8 (include tax)
        //         */
        String report="" ;
               double totalPrice = 0.0;
        for(int i=0;i<itemIDs.length;i++){
        for(int j=0;j<items.length;j++){
            for(int k=0;k<prices.length;k++){
     report=itemIDs[i] +" - "+ items[j]+" - "+prices[k] ;
     totalPrice+=prices[k]*0.06;
            }}}
        System.out.println(report+"\n"+totalPrice);
        //        //TASK 4. Find/Look for "Airpods" in items and print along with price and itemID
        for(int j=0;j<items.length;j++){
          if(items[j].contains("Airpods" )) {
          }
            System.out.println(itemIDs[j] +" "+ items[j]+" "+prices[j] );}
        //        //TASK 5. Find the most expensive item and print all details
        //        //{99.99, 150.0, 9.99, 250.0 , 439.50, 39.99}
        double maxPrice = prices[0];
        int maxPriceIndex = 0;
        // YOUR CODE GOES HERE
       for(int i=0; i<prices.length;i++) {
           if (maxPrice < prices[i]) {
               maxPrice = prices[i];
               maxPriceIndex = i;}}
       // BELOW IS ALREADY WRITTEN FOR YOU
                  System.out.println("Most expensive item:");
                  System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+prices[maxPriceIndex]);


       }}


















