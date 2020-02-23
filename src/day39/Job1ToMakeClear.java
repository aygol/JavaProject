package day39;

public class Job1ToMakeClear {
    public static void main(String[] args) {
Offer job1=new Offer();

        job1.salary = 109000;
        job1.company = "Verison";
        job1.location = "West Palm Beach";
        job1.isFullTime = false;
        job1.salary = 140000;

job1.changeAllInfo("Amazon","Virginia",150000,true);
job1.displayOfferDetails();
//boolean result=job1.is100KOffer();
//if (result==true){
 //   job1.changeLocation("Atlanta");}
//KISA YOL

job1.displayOfferDetails();
   if (job1.is100KOffer()) {
       job1.changeLocation("Atlanta");
   }job1.displayOfferDetails();
//   job1.toString();
        System.out.println( job1.toString());
        System.out.println(job1);
    }
}
