package day38;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllMethodPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);
        System.out.println("nums1 "+nums1);
        ArrayList<Integer> nums2 = new ArrayList<>();
       //Iwant to remove 100, 133
        //just like addAll method , removeAll method expect another collections List Object to be removed
        nums1.removeAll(Arrays.asList(100,133));
        System.out.println("nums1 after removing = "+nums1);
        nums1.removeAll(Arrays.asList(100,1330));//icindeki sadece olan varsa remove yapar yoksa nothing
        //if I have two item insame which one remove answer hepsini all if you have remove if do not have leave alone



    }
}
