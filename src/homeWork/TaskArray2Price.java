package homeWork;

public class TaskArray2Price {
    public static void main(String[] args) {
//, loop through each prices  and print them in one line
//           2.1 print each prices in even index
//           2.2 print only prices less that 3 dollars
//           2.3 print the sum of all the prices and get average
//           2.4 print only the second half of prices (last 3)
//           2.5 print the sum of the middles two price
//           2.6 print only prices more than average price
//           2.7 find out max price and print out max price and  index of max price
//           2.8 find out the minimum price and index of minimum price
//           2.9 find out second max price and index
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4, 65f, 3.89f, 3.88f, 2.88f};
        int groceryLength = 6;
        float sum = 0;
        float avarage;
        float last3Sum=0;
        float middleSum = 0;
        for (int x = 0; x < prices.length; x++) {
            System.out.print("each prices =" + prices[x]);
            System.out.print("->");
        }
        for (int x = 0; x < prices.length; x++) {
            if (x % 2 == 0) {
                System.out.println("each prices in even index = " + prices[x]);
                System.out.print("->");
            }
        }
        System.out.println("********");
        for (int x = 0; x < prices.length; x++) {
            if (prices[x] < 3) {
                System.out.println(" prices less that 3 dollars = " + prices[x]);
            }
        }
        System.out.println("*****");
        for (int x = 0; x < prices.length; x++) {
            sum += prices[x];

        }
        System.out.println("sum =" + sum);
        System.out.println("avarage = " + sum / prices.length);
        for (int x = prices.length / 2 + 1; x < prices.length; x++) {
            last3Sum=last3Sum+prices[x];
        }
        System.out.println("*****");
        float  middlePrices=0.0f;
        System.out.println("last3Sum "+last3Sum);
        for(int x=prices.length/2; x<=prices.length/2+1;x++){
middlePrices=middlePrices+prices[x];


        } System.out.println("middlePrices "+middlePrices);
        {


        }
    }
}