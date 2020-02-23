package day26;

import java.util.Arrays;

public class EachLoopPractice {
    public static void main(String[] args) {
        char [] ch={'z','d','h','y','o'};
        Arrays.sort(ch);
        for(char each:ch){
            System.out.print(each);

        }
        System.out.println();
        int[]nums={1,2,3,4,5,6,7,8,9,10};
        for(int eachNums:nums){
            if(eachNums%2==0){
                System.out.print("Even Numbers "+eachNums+"\t");
            }

        }  System.out.println();
    //    int[]nums={1,2,3,4,5,6,7,8,9,10};
        for(int eachNums:nums){
            if(eachNums%2==1){
                System.out.print("Odds numbers "+eachNums+"\t");}}
  int [] arr1D={1,2,3,4}  ;
        int [][] arr2D={{1,2,3,4},{5,6,7,8}  };
        for(int each:arr1D) {

                System.out.println("1D array [] = "+each);
            }


        System.out.println();
        for(int []each1:arr2D){
            for(int each2:each1)
            System.out.println("each item 2D [][] =  "+each2);



}
        System.out.println("********************************************************");
    String [][]str2D={{"Ayse","Furkan"},{"Ahmet","Ceylin"}};
for(String []eachx:str2D){
    for(String eachy:eachx){
        System.out.print(eachy);


    }}
        System.out.println();
        for(String []eachx:str2D){
        System.out.println("Arrays.toString(eachx) = "+Arrays.toString(eachx));

        }int[][][]num3D={{{1,2},{4,3}},{{5,6},{7,9,8}}};

        for(int [] [] each2d:num3D){// uclu olandan ikili olani getirdi
            for(int []  eachd:each2d){//2 olandan birli
                for (int eachvalue:eachd){//1 liden herbirini ayr ayri getirdi
                    System.out.print(eachvalue+" ");
                }
            }

    }
        System.out.println();
        int []numbers={1,2,3,4,5,6,};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<3){
                continue;
            }
            System.out.println("numbers index"+i+"= "+numbers[i]+" ");
        }
    }}
