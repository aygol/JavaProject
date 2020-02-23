package day09;
import java.util.Scanner;
public class IfChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      //  int dayCode=scan.nextInt();
        int dayCode=3;
        switch (dayCode){
            case 1:
            System.out.println("Day is Monday!");
        break;
            case 2 :
            System.out.println("Day is Tuesday!");
        break;
            case 3 :
                System.out.println("Day is Wednesday!");
        break;
            case 4 :
            System.out.println("Day is Thurday!");
        break;
            case 5 :
            System.out.println("Day is Friday!");
        break;
            case 6 :
            System.out.println("Day is Saturday!");
            break;
            case 7:
            System.out.println("Day is Sunday!");
            break;
            default:
            System.out.println("There are not a such a day!!!");

        }
    }
}
