package day35;

public class WrapperConvertTypes {
    public static void main(String[] args) {
        float f6=Float.parseFloat("3.14");
        System.out.println(f6);
        String sentence="I bougth 3 tomato and the price was 3.14 each";
        //how much is your final price
        //the count is always 3rd word
        // the price is always at 2nd word from the last

 String []num=sentence.split(" ") ;

 Double sum=(Integer.parseInt(num[2] ))*(Double.parseDouble(num[num.length-2]));
        System.out.println(sum);
//float price = Float.parseFloat( arr[arr.length - 2].replace(',' , '.'));
    }






}
