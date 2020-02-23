package homeWork;

public class WaterBill { public static double waterTax(double units)
{
    double bill = 0.0;

    //your code here
    if(units <=50){
        bill+=units*0.60;
        return bill;
    } else if(units >100&& units <= 150){
        bill+=(units * 0.90)+50;
        return bill;
    }else  {
        bill+=(units * 0.90)+100;
        //end your code here


        return bill;
    }//end waterTax

}

    public static void main(String[] args) {
        System.out.println(waterTax(50));
        System.out.println(waterTax(55));
        System.out.println(waterTax(151));
        System.out.println(waterTax(101));
    }
}

