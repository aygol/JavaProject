package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Swamp {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(8);
        mylist.add(45);
        mylist.add(9);
        mylist.add(6);
        mylist.add(43);
        reverselist(mylist);
    }
    public static void reverselist (List<Integer> nums){
        int temp=0;
        for (int i = 0; i <nums.size()/2 ; i++) {
            temp=nums.get(i);
            nums.set(i,nums.get(nums.size()-1-i));
            nums.set(nums.size()-1-i,temp);
        }
        System.out.println(nums);
    }
    }

