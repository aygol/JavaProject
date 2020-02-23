package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPriceWithLoop {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        for(int x=1; x<=100;x++){
            nums.add(x);
        }
        System.out.println("nums = "+nums);
    //change all odd number value to 0;
        for(int i=0; i<100;i++){
            if(nums.get(i)%2==1){
            nums.set(i,0) ;
            }
    }
        System.out.println("change all odd number value to 0 = "+nums);
        nums.add(0,100);
        System.out.println("change index 0 number value to 100 = "+nums); //all numbers shiwft to the next index
        List<Integer>lst2=new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst= "+lst2);

        System.out.println(" lst2.get(2);"+   lst2.get(2));
        lst2.add((lst2.indexOf(34))+1,100);
        System.out.println("lst= after change 34 to 100 "+lst2);
        //add five 100 in front of 44
        lst2.add(lst2.indexOf(44),100);
        System.out.println("last2 after adding 100 in front of 44 "+lst2);
        for(int i=0; i<4;i++){
        lst2.add(0,100);


}
        System.out.println("Lst2 after adding 100 5 times "+lst2);
lst2.set(0,200);
        System.out.println("Lst2 after lst2.set(0,200); "+lst2);
    }}