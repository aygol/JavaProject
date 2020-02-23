package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class Day39Task {
    public static void main(String[] args) {

        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));
        System.out.println("productLst = " + productLst);
        System.out.println("productLst element count  = " + productLst.size());
//         * Task 1 : print only items name
        // This is for each version
        for (String eachProduct : productLst) {
            // we get each product , then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }
        // This is for loop version
        for (int i = 0; i < productLst.size(); i++) {
            // we get each product by using get method of ArrayList in for loop
            // then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = productLst.get(i).split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }
//         * Task 2 : print all the prices more than 500
        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > 500) {
                System.out.println("price = " + price);
            }
        }
//         * Task 3 : print average price
        double sum = 0;
        double average = 0;
        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price; // sum += price ;
        }
        average = sum / productLst.size(); // sum / 12
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if (monthly < 20) {
                System.out.println(name + " " + monthly);
            }

        }

        System.out.println("-----------Task 5 ----------");
//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        for (String eachProduct : productLst) {

            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }}

        // above solution will not work
        // because we need the location of max price not the price itself
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;

        for (int i = 0; i < productLst.size(); i++) {

            // this is how we get each price part of items details
            String priceStr = productLst.get(i).split(",")[1];
            // this is how we turn the priceString into double data type
            double price = Double.parseDouble(priceStr);
            if (price > maxPrice) {
                maxPrice = price;
                maxPriceIndex = i;
            }
        }
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("expensive item detail = "
                + productLst.get(maxPriceIndex));


        System.out.println("\n-----------Task 7 ----------");
//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        int dysonIndex=0;
        for(int i=0; i<productLst.size();i++){
if(productLst.get(i).startsWith("Dyson")){
    dysonIndex=i;}
}  System.out.println("dysonIndex = " + maxPriceIndex);
        String dysonDetails=productLst.get(dysonIndex);
        String name=dysonDetails.split(",")[0];
        double price=Double.parseDouble(dysonDetails.split(",")[1]);
        double montly=Double.parseDouble(dysonDetails.split(",")[2]);
        dysonDetails=name+","+price*0.2+","+montly*0.2;
        System.out.println("\n-----------Task 8 ----------");
//         * Task 8 : Count the items prices more than average price.
        int cnt=0;
        for(String eachProduct:productLst){
        //    double price=Double.parseDouble(eachProduct.split(",")[1]);
            if(price>average){
                cnt++;
            }
        }
        System.out.println("all item more than avarage "+cnt);

        System.out.println("\n-----------Task 9 ----------");

//         * OPTIONALLY
//         * Task 9 : Remove all the items has more than average price.
        for(int i=0;i<productLst.size();i++){
productLst.remove(i);
i--;
        }


        System.out.println("\n-----------Task 3 ArrayList Objects ----------");
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();
        for (int i = 0; i < productLst.size(); i++) {
            itemNames.add(productLst.get(i).split(",")[0]);
            prices.add(Double.parseDouble(productLst.get(i).split(",")[1]));
            monthlyPayments.add(Double.parseDouble(productLst.get(i).split(",")[2]));
        }
        System.out.println("itemNames = " + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);



    }

    }
