package day39;

import java.util.ArrayList;
import java.util.List;

public class OfferTaskJob {
    //Create Offer class with
    //instance fields :
    //location, company, salary , isFullTime
    //instance methods :
    //displayOfferDetails -- print all info about offers
    //Create 5 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
    //Optionally : @channel
    //Store them into List<Offer> then call the method.
    //Optionally :
    //Add 5000 to each offers less than 100K
    public static void main(String[] args) {
        Offer job1 = new Offer();
        job1.salary = 10000;
        job1.company = "Amazon";
        job1.location = "Miami";
        job1.isFullTime = true;
        job1.displayOfferDetails();
        Offer job2 = new Offer();
        job2.salary = 9000;
        job2.company = "Verison";
        job2.location = "West Palm Beach";
        job2.isFullTime = true;
        job2.displayOfferDetails();
        Offer job3 = new Offer();
        job3.salary = 120700;
        job3.company = "T- Mobile";
        job3.location = "Margate";
        job3.isFullTime = false;
        job3.displayOfferDetails();
        Offer job4 = new Offer();
        job4.salary = 109000;
        job4.company = "Verison";
        job4.location = "West Palm Beach";
        job4.isFullTime = true;
        job4.displayOfferDetails();
        Offer job5 = new Offer();
        job5.salary = 250700;
        job5.company = "FutureDream";
        job5.location = "Jubiter";
        job5.isFullTime = true;
        job5.displayOfferDetails();
        List<Offer> jobs = new ArrayList<>();//List<Offer>jobs=newArrayList<>(Array.asList(job1.job2,job3,job4,job5));
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);
        jobs.add(job5);
        System.out.println("**********Each LOOP********************");
        for (Offer each : jobs) {
            each.displayOfferDetails();
        }
        for (Offer each : jobs) {
            if (each.salary < 100000) {
                each.salary += 500;

            }
            each.displayOfferDetails();
        }
        System.out.println("**********FOR LOOP********************");
for(int x=0;x<jobs.size();x++){
    //store each item a variable each
    Offer each=jobs.get(x);
    each.displayOfferDetails();
}job1.salary=job1.salary+2000;
job1.salary+=2000;
job4.turnToFullTime();
job4.changeLocation("DC");
job4.displayOfferDetails();
    }
}
