package day37;

import java.util.ArrayList;

public class Warm_UpContinue {
    public static void main(String[] args) {
        ArrayList<Double> priveList=new ArrayList<>();
        priveList.add(9.99);
        priveList.add(12.99);
        priveList.add(2.39);
        priveList.add(3.95);
        priveList.add(11.29);
        priveList.add(1.2);
        priveList.add(3.99);
        priveList.add(65.59);
        priveList.add(999.99);
        System.out.println(" priveList "+priveList);
//change 2. value with 10
        priveList.set(2,10.0);
        System.out.println("2. item= "+priveList.get(2));
//add 4 dolars to first price

        priveList.set(0,priveList.get(0)+4);
        System.out.println("add 4 dolars to first price priveList.get(0) = "+priveList.get(0));
        //change last price to sum of first and second price
        priveList.set(priveList.size()-1,priveList.get(0)+priveList.get(1));
        System.out.println("change last price to sum of first and second price "+priveList.get(priveList.size()-1));
        System.out.println("New priveList "+priveList);
        //give %40 of second price
       priveList.set(1,priveList.get(1)+0.6) ;
        System.out.println("give %40 of second price "+priveList);
       for(int i=0; i<priveList.size();i++){
            priveList.set(i, priveList.get(i)*2);
       }
        System.out.println("After double = "+ priveList);
        for(int i=0; i<priveList.size();i++){
       double eachPrice=priveList.get(i);
if(eachPrice>=20){
    priveList.set(i,eachPrice/2);// priveList.set(i,priveList.get(i)/2);

}}  System.out.println("Pricelist after cutting half the prices ore than 20 "+priveList);
     //swap the first value with the last value
     Double temp=priveList.get(0);
     priveList.set(0,priveList.get(priveList.size() -1));
     priveList.set(priveList.size() -1,temp);
        System.out.println("PriceList after swapping first and last value: "+priveList);

    }}



