package day20;

public class WorkingWithMoreThanOneCharInString {
    public static void main(String[] args) {
    //given a string with even number character count print 2 charactersin one line for examplw
  //for example Gokyuzum

String name="Gokyuzum";
int charCount=name.length();
//int x=0;
     /*   System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
        x=x+2;
        System.out.println(name.substring(x,x+2));
        my condition is x<=charCount-2  or lastCharIndex-1*/
     int lastCharIndex=charCount-1;
        for(int x=0;x<=lastCharIndex-1; x+=2 ){
            System.out.println(name.substring(x,x+2));
        }
    }
}
