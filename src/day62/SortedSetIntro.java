package day62;
import java.util.*;
public class SortedSetIntro {
    public static void main(String[] args) {
        //Sorted interface extends Set Interface
        //it is a data structure that store unique elements in sorted
        //The implementing class is TreeSet
        //tell me about difference between hashSet linkedHashSet and treeSet ?
//does not have duplicate hashSet
//everything sorted duplicates removed treeSet
//no duplicates + insertion order LinkedHashSet

        SortedSet<Integer>mySet=new TreeSet<>();
        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);
        System.out.println("mySet "+mySet);
        System.out.println("Myset.first "+mySet.first());//min value
        System.out.println("Myset.last "+mySet.last());

    }
}
