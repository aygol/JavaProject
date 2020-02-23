package day31;

public class SesonChecker {
    public static void main(String[] args) {
 decideSeaseonAction("Winter");
     String   mySeason="Fall";
 decideSeaseonAction("Summer");
 decideSeaseonAction(mySeason);
  }
    public static void decideSeaseonAction(String season){

        switch(season){
            case"Spring":
                System.out.println("Hiking");
                break;
            case"Summer":
                System.out.println("Swimming");
                break;
            case"Fall":
                System.out.println("Pumpkin picking");
                break;
            case"Winter":
                System.out.println("Go snowbording");
                break;
            default:
                System.out.println("Invalid Season");

    }






}}
