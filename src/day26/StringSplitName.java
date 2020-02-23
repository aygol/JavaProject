package day26;

import java.util.Arrays;

public class StringSplitName {
    public static void main(String[] args) {
        String students="Abbos, Zulya,Zhibek,Hasan,Muge, Orhan,Susan";
        students=students.replace(" ","");
        String [] namesArray= students.split(",");
        System.out.println("namesArray = " + Arrays.toString(namesArray));

        for (String name:namesArray){
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i)+"-");

            }


            System.out.println();
        }
    }
    }

