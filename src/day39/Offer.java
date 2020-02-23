package day39;

import java.util.ArrayList;

public class Offer {
String location;                    //instance fields :
    String company;                               //location, company, salary , isFullTimeString company;                         // String company;
double salary;
boolean isFullTime;
public void displayOfferDetails(){            //displayOfferDetails -- print all info about offers
    System.out.println(company+" "+location+" "+"Is it full time "+isFullTime+"  $"+salary);
}public void ListOffer(){
        ArrayList<String> lst=new ArrayList<>();


    }public void turnToFullTime(){
    if(isFullTime==false){
        isFullTime=true;
    }else{
        System.out.println("Is Already fulltime");
    }
    }
public void changeLocation(String newLocation){
    location =newLocation;
}//write a method to accept 4 parameter to change all info
    public void changeAllInfo(String newCompany, String newLocation,double newSalary,boolean newFulltime){

    }public boolean is100KOffer(){
    return salary>=100000;
    }public String toString(){
   String result=company+" "+location+" "+"Is it full time "+isFullTime+"  $"+salary;

    return result ;

    }

    }


