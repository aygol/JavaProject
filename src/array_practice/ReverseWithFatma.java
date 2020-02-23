package array_practice;

public class ReverseWithFatma {
    public static void main(String[] args) {
        String str="Ayse den Fatmaya Sevgiler";


        char []arr=str.toCharArray();
        String reverse="";
        for(int x=arr.length-1;x>=0;x--){
            reverse+=arr[x];
        }
        System.out.println(reverse);//outcome   religveS ayamtaF ned esyA
        System.out.println("*****************************");
        System.out.println("Kelime kelime reverse");
       //  String str="Ayse den Fatmaya Sevgiler";
        String [] strArray=str.split(" ");
        String result="";
        for(int x=strArray.length-1;x>=0;x--){
            result+=" "+strArray[x];
        }
        System.out.println(result);//output   Sevgiler Fatmaya den Ayse
        System.out.println("*****************************");
        System.out.println("harf harf reverse");
        //  String str="Ayse den Fatmaya Sevgiler";
        String [] strArray1=str.split("");
        String result1="";
        for(int x=strArray1.length-1;x>=0;x--){
            result1+=""+strArray1[x];
        }
        System.out.println(result1);//output     religveS ayamtaF ned esyA
    }
}
