package day36;

import java.util.ArrayList;

public class ArrayListObject {
    public static void main(String[] args) {
        ArrayList<Long> lst = new ArrayList<>();
        //C.R.U.D    Create read Update, delete
        lst.add(12L);//2L is aoutmatically converted to new Long (12); because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        System.out.println("lst " + lst);
        System.out.println("lst size =" + lst.size());
        System.out.println("lst.get(0) =" + lst.get(0));
        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {

            sum += lst.get(i);
            System.out.println();
        }
        System.out.println(sum);
        //Task get the max of abovethe list
       long max= lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
        if(lst.get(i)>max){
    max=lst.get(i);

            }}
            System.out.println(max);
        //I want to insert 125 between 100L and 150L basically 2nd and 3rd item
        lst.add(2,125L);
        System.out.println("insert 125 between 100L and 150L "+lst);
//updating set method
        lst.set(3,195L);
        System.out.println("New value for lst.get(3) "+ lst.get(3));
        lst.remove(100L);
        System.out.println("removing 100 after \n\t"+lst);
        lst.remove(2);
        System.out.println("lst removing  after 2 nd index \n\t"+lst);
        System.out.println("Location of 200L is using lst.indexOf(200L) ="+lst.indexOf(200L));
   //how to delete everything
        lst.clear();
        System.out.println("check after clearing lst.Empty()= "+lst.isEmpty());
   //check whether we have cetain item or not
        lst.contains(100L);
        System.out.println("do have certain item "+lst.contains(100L));
        //if we use indexOf method , if it is return-1, itmeans we do not have it
        System.out.println("Do I have 10L="+(lst.indexOf(10L)));


    }
}