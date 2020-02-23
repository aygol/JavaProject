package day08;

public class MultiBrachIfStament {
    public static void main(String[] args) {
        /*given your current speed speedlimit check whether the current spend is
        more than90 jail
        more than80 less than 90 reckless drivind
        more than 70 and less than 80 point taken
        more than 60 and less than 70 warning
        if not speeding keep driving
    */
   int currentSpeed=80;
  if (currentSpeed>90){
      System.out.println("Go jail!!");
  }if(currentSpeed>80){
            System.out.println("reckless driving!!!"); }
  if(currentSpeed>70) {
       System.out.println("You are speeding more than 70-- point taken!!! ");
   } else if(currentSpeed>60) {
       System.out.println("You are speeding less than 70 but more than 60 Warning");
   }else {
       System.out.println("Keep driving you are good!!");



   }




    }


}
