package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
    String msg="I struggle with java I like Java I love Java Everything is Awesome!";
    String msg1="";
    for(int i=1; i<=msg.length()-1;i++){
       msg1= msg.substring(i,i+1);
        if(i%2!=0){
            continue;


        }
     //   if(msg.equals('a')){
     //       break;
        System.out.println(msg1);
    }
     //   System.out.print(msg1);




    }
}
