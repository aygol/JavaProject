package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IterationAnyCollection {

    public static void main(String[] args) {
        Collection<Integer> nums =new ArrayList<>(Arrays.asList(10,4,5,22,88,13));
        Iterator<Integer> myIter=nums.iterator();
        System.out.println("myiter.hasnext() = "+myIter.hasNext());//is check if you have it
        System.out.println("myiter.next() = "+myIter.next());//get if you have
    }
}
