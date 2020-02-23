package day62;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        //if you want to keep insertion order (first come first serve)
        //and it also remove duplicates
Set<Integer> myNums=new LinkedHashSet<>();
myNums.add(10);
        myNums.add(10);
        myNums.add(20);
        myNums.add(40);
        myNums.add(30);
        myNums.add(20);
        myNums.add(10);
        System.out.println("myNums "+myNums);
        Set<Integer> myNums1=new HashSet<>();
        myNums1.add(10);
        myNums1.add(10);
        myNums1.add(20);
        myNums1.add(40);
        myNums1.add(30);
        myNums1.add(20);
        myNums1.add(10);
        System.out.println("myNums1 "+myNums1);
    }

    }

