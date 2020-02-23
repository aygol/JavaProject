package homeWork;

public class TaskArrray4 {
    public static void main(String[] args) {
      /*  loop through each prices  and print them in one line
        2.1 print each prices in even index
        2.2 print only prices less that 3 dollars
        2.3 print the sum of all the prices and get average
        2.4 print only the second half of prices (last 3)
        2.5 print the sum of the middle two prices
        2.6 print only prices more than average price
        2.7 find out max price and print out max price and  index of max price
        2.8 find out the minimum price and index of minimum price
        2.9 find out second max price and index(challenging)*/
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        float count=0;
        for (float eachprices : prices) {
            System.out.println("each prices " + eachprices);
            count=count+eachprices;
        }
        System.out.println("total "+count);

        System.out.println("avarage "+ count/prices.length);
             for (float eachprices : prices) {
        if(eachprices%2==0) {
            System.out.println(eachprices);
        }}

        for (float eachprices : prices) {
            if (eachprices < 3) {
                System.out.println(eachprices);
            }
            float total3 = 0;
            for (int x = prices.length - 1; x >= prices.length / 2; x--) {

                total3 += prices[x];
            }
            System.out.println("total3 " + total3);


        }}}

