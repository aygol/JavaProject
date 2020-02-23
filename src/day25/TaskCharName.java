package day25;

public class TaskCharName {
    public static void main(String[] args) {
        //pick up yoour name and turn in into char array // pick up your own name and turn in into char array and use for each loop to loop over them
        // optionally count how many a you have in your name
  String name="Ayse";
 // char [] Myname={'A','Y','S','E'};
   char [] allCharsInName=name.toCharArray();
    //   char [] myName=new char
        for(char eachChar:allCharsInName) {
            System.out.println("eachChar =" + eachChar);
        }  int count = 0;

        for(char eachChar:allCharsInName) {
     if(eachChar=='A'){
                  ++  count;
                }


            }
        System.out.println("count ="+count);             }}


