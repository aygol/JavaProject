import java.sql.SQLOutput;

public class StringCahrecter {
    public static void main(String[] args) {

       // reverse your name
       String name="Ayse";

       System.out.println(name.charAt(0)+""+name.charAt(1)+""+name.charAt(2)+""+name.charAt(3));

        System.out.println(name.charAt(3)+" "+name.charAt(2)+" "+name.charAt(1)+" "+name.charAt(0));
//how you know last character of any string
        //contain characte srart with one;counting index start 1
  int characterCount=name.length();
int lastCharIndex=characterCount-1;
char lastChar=name.charAt(lastCharIndex);

        System.out.println("Last char is "+lastChar);

        System.out.println("Last char is on shot"+name.charAt(name.length()-1));


    }
}
