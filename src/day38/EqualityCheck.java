package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class EqualityCheck {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(100, 200, 300, 400));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(100, 200, 300, 400));
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(300, 200, 400, 300));
        System.out.println("nums1.equals nums2 = "+nums1.equals(nums2));
        System.out.println("nums1.equals nums3 = "+nums1.equals(nums3));
        System.out.println("nums2.equals nums3 = "+nums2.equals(nums3));
    }
}
