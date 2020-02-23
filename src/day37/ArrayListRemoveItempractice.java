package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveItempractice {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        lst.add(2);
        System.out.println("last+= "+lst);
        //I want to remove value of 2
     //   lst.remove(new Integer(2));
        lst.remove(Integer.valueOf(2));
        System.out.println("After we remove 2 from list "+lst);
        lst.remove(Integer.valueOf(200));
        System.out.println("After we remove 200 from list "+lst);//does not happened because if you do not have it
        System.out.println("lst "+lst);

    }
}
