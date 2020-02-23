package day61;

import java.util.*;

public class JobHunter {

    public static void main(String[] args) {

        Job j1=new Job("Austin",10000,"Verzion");
        Job j2=new Job("California",95000,"Bank of America");
        Job j3=new Job("Virgina",85000,"Fells Fargo");
        System.out.println("j1 compare to (j2) "+j1.compareTo(j2)) ;
        System.out.println("j2 compare to (j3) "+j2.compareTo(j3));
        System.out.println("***********************************************");

        List<Job> lst = new LinkedList<>();

        lst.add(new Job("Austin",100000,"Verzion"));
        lst.add(new Job("California",95000,"Bank of America"));
        lst.add(new Job("Virgina",85000,"Fells Fargo"));
        lst.add(new Job("Dallas",75000,"Sprint"));
        lst.add(new Job("Washington",120000,"Apple"));
        System.out.println("MyFavJobs lst  "+lst);
        Collections.sort(lst);
        System.out.println("After MyFavJobs lst  "+lst);
Collections.sort(lst, Comparator.reverseOrder());//reverse order of collections(class) sort methot
        System.out.println("After reverse MyFavJobs lst  "+lst);
        Collections.sort(lst,Collections.reverseOrder()); //both of them hve reversed logic they are just two different place
        //this methots static Comparator interface and Collections class
    }
}
