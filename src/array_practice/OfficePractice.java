package array_practice;

import java.util.Arrays;

public class OfficePractice {
    public static void main(String[] args) {
        char []characters={'d','b','c','f','x'};
        Arrays.toString(characters) ;
        System.out.println(Arrays.toString(characters) );
        System.out.println("characters "+characters);//characters [C@723279cf
  int nums[] ={10,9,4,7,9,2,3,1,90} ;
       Arrays.toString(nums);
        System.out.println( Arrays.toString(nums));
      //  System.out.println("nums "+nums); output nums [I@b4c966a
Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("********");
      //write program that print out the uniquw volues from an array
     int[] numbers={1,1,2,2,3,4,4,5,5};//ecpected result 3
     int count=0;
   for(int j=0;j<numbers.length;j++){

     for (int i=0; i<numbers.length;i++){
       if  (numbers[i]==numbers[j]) {
           count++;
       }}
       if(count==1){
             System.out.println(numbers[j]);
         }

    String []   str={"A","B","B","C"} ;
       int count2=0;
      for(int x=0; x<str.length;x++){
       for (int i=0; i<str.length;i++){


        if(str[i].equals(str[x])){
            count2++;
        }}
           if (count2==1)
               System.out.println(str[x]);
    }

   }}}
