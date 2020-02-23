package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskFromAkbar {
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9) ) ;
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(2,4,5,6,7,8,9,12,17,19) ) ;

//Add numbers2 list to numbers1 list without duplicate items from numbers 2

       // numbers1.addAll(numbers2);
     //   System.out.println(numbers1);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 4, 5, 6, 7, 8, 9, 12, 17, 19]
//numbers1.retainAll(numbers2);//[2, 4, 5, 6, 7, 8, 9, 2, 4, 5, 6, 7, 8, 9, 12, 17, 19]
//        System.out.println(numbers1);
//Hint : removeAll , addAll bulk operations (gave away too much?)
        numbers1.removeAll(numbers2);//[1, 3]
        System.out.println(numbers1);
        numbers1.addAll(numbers2);//
        System.out.println(numbers1);//[1, 3, 2, 4, 5, 6, 7, 8, 9, 12, 17, 19]
    }
}
