package day21;

public class MyNameWakeUp {
    public static void main(String[] args) {
         String myName="My name is Ayse Golcu";
       int charCount= myName.length() ;
       int lastCharIndex=charCount-1;
       for(int x=0; x<=lastCharIndex;x++){
           System.out.print(myName.charAt(x)+"->");
        //   System.out.print(myName.substring(x,x+1));
         //  System.out.println(myName.substring(x,myName.length()-2));


       }
for(int x=0; x<charCount-2;x++){
    String twoChar=myName.substring(x,x+2);
    System.out.print(twoChar+"->");
}
        for(int x=0; x<charCount-2;x++){
            String threeChar=myName.substring(x,x+3);
            System.out.print(threeChar+"->");
        }


    }
}
