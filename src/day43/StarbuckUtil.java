package day43;

public class StarbuckUtil {
    public static void main(String[] args) {
 Coffee c3=new Coffee("Blonde",5,1.6);
        printCoffeeInfo(c3);
    }
public static void printCoffeeInfo(Coffee co){
    System.out.println(co.getType());
    System.out.println(co.getPrice());
    System.out.println(co.getCaffeinLevel());
}public static void printStringInfo(String str){
        System.out.println("First character is "+str.charAt(0));
        System.out.println("last character is "+str.charAt(str.length()-1));

    }



}
