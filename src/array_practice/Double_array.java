package array_practice;
import java.util.Arrays;
public class Double_array {
    public static void main(String[] args) {
        double[ ] prices={2.3,4.3,2.5};
        String doublePrices= Arrays.toString(prices);
        System.out.println(" Arrays.toString(prices) "+Arrays.toString(prices));
        System.out.println("first character of Arrays.toString(prices) "+Arrays.toString(prices).charAt(0));
for(int x=0;x<doublePrices.length();x++){
    System.out.println("Arrays.toString(prices) character index "+x+" "+doublePrices.charAt(x)    ) ;

}

    }
}
