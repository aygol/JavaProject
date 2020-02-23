package day36;

import java.util.ArrayList;

public class ArrayListCalisma {
    public static void main(String[] args) {
        ArrayList<Long> lst = new ArrayList<>();
        //C.R.U.D    Create read Update, delete
        lst.add(12L);//2L is aoutmatically converted to new Long (12); because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
//   lst.remove(12);
         lst.remove(12L);
        System.out.println("lst "+lst);

        ArrayList<Integer> num = new ArrayList<>();
        //C.R.U.D    Create read Update, delete
        num.add(12);//2L is aoutmatically converted to new Long (12); because ArrayList only store object
        num.add(100);
        num.add(150);
        num.add(200);
      //  num.remove(12);
        num.remove(Integer.valueOf(12));
        System.out.println(num);
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(12);//2L is aoutmatically converted to new Long (12); because ArrayList only store object
        num1.add(100);
        num1.add(150);
        num1.add(200);
        num1.add(12);//2L is aoutmatically converted to new Long (12); because ArrayList only store object
        num1.add(600);
        num1.add(150);
        num1.add(400);
        num1.retainAll(num);
        System.out.println("After retain "+num1);//bu method sadece digeriyle ortak olani alir

    }




}
