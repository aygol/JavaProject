package array_practice;

import java.util.Scanner;

public class MathRandomLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
  String rapor="";
   int sayac=0;
   int dogrusayaci=0;
   while (sayac<5){
       int sayi1=(int )(Math.random()*10);
       int sayi2=(int)(Math.random()*10);
   if(sayi1<sayi2){
       int temp=sayi1;
       sayi1=sayi2;
       sayi2=temp;
   }
       System.out.println(sayi1+"-"+sayi2+"=?");
   int cevap=scan.nextInt();
   if(sayi1-sayi2==cevap){
       System.out.println("Bildiniz");
       dogrusayaci++;
       rapor+=sayi1+"-"+sayi2+"="+cevap+"dogru\n";
   }else{
       System.out.println("Bilemediniz");
 rapor+=sayi1+"-"+sayi2+"=" +cevap+"yanlis\n" ;
   }
sayac++;
    }
        System.out.println(dogrusayaci+"tane dogru cevap verdiniz");
        System.out.println(rapor);
}}
