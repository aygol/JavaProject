package array_practice;

import java.util.ArrayList;

public class Array_List_Swap {
    public static void main(String[] args) {
   ArrayList<Integer>speed=new ArrayList<>();
   speed.add(90);   speed.add(160);   speed.add(140);   speed.add(95);
        speed.add(135);
        speed.add(125);
        caughtSpeeding(speed);

    }public static void caughtSpeeding(ArrayList<Integer> lst) {
        //Write a static void method to accept a List<Integer> and reverse it
        //(Do not create new List, use swamp logic)
        int temp;
        //int j=lst.size()-1;
        System.out.println("Before Swaping "+lst);
        for(int i=0, j=lst.size()-1; i<=lst.size()/2;i++,j--){
            temp=lst.get(i);
            lst.set(i,lst.get(j));
            lst.set(j,temp);}
            System.out.println("After Swaping "+lst);
    }}

