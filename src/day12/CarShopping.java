package day12;

public class CarShopping {
    public static void main(String[] args) {

        String carBrand="corolla";
        int carPrice=30000;
       double budget =40000;
       if(carBrand.equals("corolla")||carBrand.equals("Tesla")&&carPrice<=budget) {
           System.out.println("CAR ACQUIRED!!!");
       } else{
           System.out.println("NOT WHAT I AM LOOKING FOR");


       }





    }
}
