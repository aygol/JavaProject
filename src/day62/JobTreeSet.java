package day62;

import day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {
        //Create a sortedset of job from day 61 with TreeSet implementation
        //add 5 jobs and print them out vertically and see what you get
        SortedSet<Job>treeset=new TreeSet<>();
        treeset.add(new Job("FL",10000,"Verzion"));
        treeset.add(new Job("FL",11000,"Verzion"));
        treeset.add(new Job("California",85000,"Bank of America"));
        treeset.add(new Job("Virgina",85000,"Fells Fargo"));
        treeset.add(new Job("Dallas",75000,"Sprint"));
        treeset.add(new Job("Washington",120000,"Apple"));
        System.out.println("treeSet "+treeset);
for(Job each:treeset){
    System.out.println("each= "+each);
}
}}
