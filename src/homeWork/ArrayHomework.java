package homeWork;

public class ArrayHomework {
    public static void main(String[] args) {
        // 3, assume that the order of grocery Items match the prices in same order do below:
        //            3.1 print first item and first price in one print statement -->>  apple price is 1.99
        //            3.2 print last item and last price in one print statement-->>  kiwi price is 2.88
        //            3.2 print all items and prices in one for loop together
        //            3.3 print only those items with price more than 3.11
        //            3.4 print only those items with price more than average
        //            3.5 print only those prices of grocery items that contains letter b
        //            3.6 print the item name with max price
        //            3.7 print the item name with min price
        String[] groceryitems = new String[] {"apple","banana","grape","strawberry","blueberry","kiwi"};
        float[] prices = new float[]  { 1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f };

       float total=0.0f;
        System.out.println(groceryitems[0]+" price is "  +prices[0]);//first item

        System.out.println(groceryitems[groceryitems.length-1]+" price is "  +prices[prices.length-1]);//last iem
    for(int i=0;i<groceryitems.length;i++){
        System.out.println(groceryitems[i]+" price is "  +prices[i]);

    }System.out.println("*******");
        for(int i=0;i<groceryitems.length;i++) {
            if (prices[i] > 3.11) {
                System.out.println(groceryitems[i] + " price is " + prices[i]);
            }
        }  for(int i=0;i<groceryitems.length;i++) {
      total=total+ prices[i];} float avarage=total/prices.length;
        System.out.println(avarage);
        System.out.println("&&&&&&&&&");

        for(int i=0;i<groceryitems.length;i++){
            if(prices[i]>avarage) {
                System.out.println(groceryitems[i] + " price is " + prices[i]);
            }}for(int i=0;i<groceryitems.length;i++){

if(groceryitems[i].contains("b")){
    System.out.println(groceryitems[i] + " price is " + prices[i]);
    //  float max = prices[0];
    //        for(float eachPrice : prices){
    //            if(eachPrice>max){
    //                max=eachPrice;
    //            }
    //        }
    //​
    //        for (int i=0, j=0; i<prices.length; i++, j++){
    //            if(prices[j]==max){
    //                System.out.print("Item "+groceryItems[i]+ " Price "+prices[j]+ " ");
}}System.out.println("max price");
    float    max=prices[0];
        for(float eachprice:prices) {
             if(eachprice>max){
             max=    eachprice;

            }
        }
        for(int j=0;j<groceryitems.length;j++){

            if (prices[j]==max) {
                System.out.println(groceryitems[j] + " price is " + prices[j]);

            }
        }

        System.out.println("min price");
     float   min=prices[0];
     for(float eachprices:prices){
         if(eachprices<min){
             min=eachprices;
         }}
        for(int j=0;j<groceryitems.length;j++){

            if (prices[j]==min) {
                System.out.println(groceryitems[j] + " price is " + prices[j]);
     }
        }}}


