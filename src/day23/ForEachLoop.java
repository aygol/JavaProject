package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        double[] prices={99.23, 11.99,100.23,99.99,56.34};
   //     for each loop syntx for daaratypetoyout arrray variable name for eachaitem; your arrry variable)

      for(int x=0; x<prices.length;x++)  {

        double eachPrice=prices[x];
          System.out.println("each price "+eachPrice);
          System.out.println("***************SAME*********");

    }
    for(double eachPrice : prices) {
        System.out.println("each price "+eachPrice);
    }

}}
