package ReplyIt;

import java.util.Scanner;

public class SeniorCtizen {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int  seniorCitizens=scan.nextInt();
        int  nonSeniorCitizens=scan.nextInt();
        System.out.println("What is new citizen's age?");

        int age =scan.nextInt();

        if(age>=65){
            System.out.println("Senior Citizen" );
            System.out.println("New  SeniorCitizens count " + ++seniorCitizens+"\n"+"New nonSeniorCitizens count "+nonSeniorCitizens);

        }else if (age<65){
            System.out.println("Non-Senior Citizen" );
            System.out.println("New  SeniorCitizens count " +seniorCitizens+"\n"+"New nonSeniorCitizens count "+ ++nonSeniorCitizens);
        }




        }


        }













