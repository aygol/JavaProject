package day51_Polimorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {
        Person p1=new Person("Ayse",44);
        Person p2=new Person("Ali", 17);
        System.out.println(p1);
        System.out.println(p2);
        //compare p1 to p2 by age if p1 is older print 1 if they are same age print 0
        //if p2 is older print -1
     if (p1.age>p2.age) {
         System.out.println(1);
     }else if (p1.age<p2.age) {
            System.out.println(-1);
        } else {
            System.out.println(0);
     }
        System.out.println(p1.compareTo(p2 ));
        Person p3=new Person("Ahmet",22);
        Person p4=new Person("Ceylin", 11);
        System.out.println(p4.compareTo(p3 ));

        Person p5=new Person("Seyma",7);
        Person p6=new Person("Ada", 7);
        System.out.println(p5.compareTo(p6 ));
        int result=p2.compareTo(new Person("Jon Snow",27));
        System.out.println("result "+result);
//print out the name of older person between p2 and p3
        //it's asked to use compareTo method we just created
        if (p1.compareTo(p3)==1){//if p1>p2 it gives 1 that is why we do ==1
            System.out.println(p3.name);

        }else{
            System.out.println(p1.name);
        }
        System.out.println("=====================================");
    List<Person> lst=new ArrayList<>();
        lst.add(p1)  ;
        lst.add(p2)  ;
        lst.add(p3)  ;
        lst.add(p4)  ;
        lst.add(p5)  ;
        lst.add(p6)  ;
        System.out.println("lst before sorthing "+"\n"+lst);
//ANYTHING WE SORT MUST BE A TYPE OF COMPARABLE
        Collections.sort(lst);
        System.out.println("lst after sorthing "+"\n"+lst);
        System.out.println("********************************************");

    }}
