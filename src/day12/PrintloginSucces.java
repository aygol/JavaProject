package day12;

import java.util.Scanner;

public class PrintloginSucces {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);



        System.out.println("Enter your season please");
        String season=scan.next();

        if(season.equalsIgnoreCase("spring")){
            System.out.println("Hiking easter nawruz blossom" );
        }else if(season.equalsIgnoreCase("summer")) {

            System.out.println("I can do swim vacation BBQ Holiday ");
        }  else if(season.equalsIgnoreCase("fall")){
                System.out.println("I can do balack Friday; hiking; harvest, hallowen shopping ");
        }  else if(season.equalsIgnoreCase("winter")) {
            System.out.println("I can do snowboarding, ski, Christmas, New Year");

        }else{  System.out.println("There is a not such a season!!!");

/*


          break;

              case"Spring" :
                  System.out.println("I can do hike easter nawruz blossom" );
                  break;

                  case "Summer":
                      System.out.println("I can do swim vacation BBQ Holiday ");
                      break;
                  default:
                      System.out.println("There is a not such a season!!!");



*/


    }
}}
