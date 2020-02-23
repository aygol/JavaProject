package day10;

public class MultiBrachCode {
    public static void main(String[] args) {
        System.out.println("welcome to MCDonald, what can I get for you");
        String order="";
        int itemNumber=35;
switch (itemNumber){
    //11 burger 5, french fry 8
    case  11:
        System.out.println("You have selected 11");
        order="Burger";
        break;
case 5: System.out.println("You have selected 5");
order="French Fry";
case 8:
    System.out.println("You have selected 8");
    order="Nuggets";
    case 35:
        System.out.println("You have selected 35");
        order="Ice Cream";
        break;
    default:
        System.out.println("you have selected unknown number !!");
        order="Unknown";
        break;}
    System.out.println("your order is "+order);





    }
}
