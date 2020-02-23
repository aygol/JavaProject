package day24;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] scores1={2,5,6,7,3,34,6};
        int[] scores2={22,45,6,37,3,6,9};
        int[] scores3={2,5,6,7,3,34,6};
        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);
        boolean isS1S2Equals= Arrays.equals(scores1,scores2);
        System.out.println("is S1 S2 score has same content "+isS1S2Equals);
        boolean isS1S3Equals= Arrays.equals(scores1,scores3);
        System.out.println("is score S1 S3 has same content "+isS1S3Equals);
    }
}
