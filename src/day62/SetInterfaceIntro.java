package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceIntro {
    public static void main(String[] args) {
        //set is a data structure to store unique elements :
        //HasSet implements Set interface and always default choice
        //HashSet<Integer> myNums=new HashSet<>();
        Set<Integer> myNums=new HashSet<>();//Set only add unique number
        myNums.add(10);
        myNums.add(10);
        myNums.add(13);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums "+myNums);
//Creation a hashSet with items already inside
 List<Integer> numlst= Arrays.asList(30,10,20,20,20,30,30,30,30) ;
 Set<Integer> myNums1=new HashSet<>(numlst);
        System.out.println("myNums1m"+myNums1);


    }
}
