package homeWork;

import java.util.ArrayList;

public class Array_List_Practice {
    public static void main(String[] args) {
        //Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
        //* print pass if its more than 60 fail if not
        //* count how many score are more than 90
        //* get the average score
        //* update the values with score-grade pair
        //  for example
        //79C , 54F, 100A, 65D, 44F , 89B , 95A
        //Optionally create 4 methods according to above criteria
        String str=("80,90,40,60,90,60,40,90,100,92,96");
        String []arr=str.split(",");
        ArrayList<String> lst=new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
        lst.add(arr[i]) ;

        }
        gradeScale(lst);
    }public static void gradeScale(ArrayList<String> lst) {
        int count = 0;
        for (int i = 0; i < lst.size(); i++) {
            int num1 = Integer.valueOf(lst.get(i));
            if (num1 > 60) {
                System.out.println(i + " pass");
            } else {
                System.out.println("Fail");
            }
        }
        for(int i=0; i<lst.size();i++){
            if(Integer.valueOf(lst.get(i))>90){
                count++;
            }
        } System.out.println("How many student get  >90  "+count);
        int sum=0;
        for(int i=0; i<lst.size();i++){
          sum+=Integer.parseInt(lst.get(i));
        }int avarage=sum/lst.size();
        System.out.println("Sum ="+sum+" Avarage= "+avarage);
//* update the values with score-grade pair
//79C , 54F, 100A, 65D, 44F , 89B , 95A
        for(int i=0; i<lst.size();i++){
   if(Integer.parseInt(lst.get(i))<=60){
       System.out.println(lst.get(i)+"F");
    }else if(Integer.parseInt(lst.get(i))<=70){
                System.out.println(lst.get(i)+"D");
   }else if(Integer.parseInt(lst.get(i))<=80){
       System.out.println(lst.get(i)+"C");
   }else if(Integer.parseInt(lst.get(i))<=90){
       System.out.println(lst.get(i)+"B");
   }else if(Integer.parseInt(lst.get(i))<=100){
       System.out.println(lst.get(i)+"A");

   }}}}