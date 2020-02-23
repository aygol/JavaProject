package day58Exception;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
     //   Thread.sleep(1000);
        List<Integer> nums = new ArrayList<>();
        //      for(int i=1; i>0;i++){
        //         System.out.println(i);
        //         nums.add(i);
        //     }
        System.out.println("Checked exception in next line");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception was caught");

            System.out.println("After  exception in next line");
        }
    }
}