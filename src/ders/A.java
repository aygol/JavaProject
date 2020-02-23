package ders;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {

    public static void removeAll( String wordList,String targetWord){


        List<String> lst = Arrays.asList (wordList);// List list1 = Arrays.asList(a);
        List<String> lst2 = Arrays.asList (targetWord);
        lst.removeAll(lst2);
        System.out.println(lst);
    }


    public static void main(String[] args) {

        removeAll("hello,hi,hello,hi","hi");
        System.out.println("******************************************");

        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","delete","1","")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n"
        );






    }

    public static String lameDb(String db, String op, String id, String data) {
        String[] str = db.split("#");
        int x = Integer.parseInt(id) - 1;

        if (op.equals("add")) {
            return db+ "#" + id + data;
        } else if (op.equals("edit")) {

            return db.replace(str[x], id + data);
        } else if (op.equals("delete")) {
            if(Integer.parseInt(id)==1){
                return db.replace(str[x], "");}
            else{
                return db.replace("#"+str[x], "");
            }
        } else
            return db;
    }



}