package array_practice;

import java.util.ArrayList;

public class BooleanMethodList {
    public static void main(String[] args) {
        ArrayList<Boolean>xc=new ArrayList<>();
       xc. add(false);
        xc. add(true);
        xc. add(false);
        repeatAl(xc);
    }    public static void repeatAl(ArrayList<Boolean>bc){
        ArrayList<Boolean>bl=new ArrayList<>();
            for(int k=0; k<=1;k++){
                for(int i=0; i<bc.size();i++){
                    bl.add(bc.get(i));
                }}System.out.println(bl);

        }}


