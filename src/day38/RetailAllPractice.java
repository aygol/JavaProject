package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetailAllPractice {
    public static void main(String[] args) {
        List<Integer> nums1=new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(200);
        nums1.add(600);
        nums1.add(122);
        System.out.println("nums1= "+nums1);
        List<Integer>nums2=new ArrayList<>(Arrays.asList(200,300,600,700,800));
        System.out.println("nums2 = "+nums2);
        nums1.retainAll(nums2);//ortak olanlari alir
        System.out.println("after reatin nums1= "+nums1);
   nums2.retainAll(nums1);
        System.out.println("nums = "+nums2);
        System.out.println(nums1.equals(nums2));   // nums1.equals(nums2) it looking for if both of them same


    }
}
