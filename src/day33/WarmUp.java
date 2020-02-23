package day33;

public class WarmUp {
    public static void main(String[] args) {
  getSpelledName("Serra") ;
  getSpelledName("Zeynep") ;
        System.out.println( getSpelledName("Serra"));
        System.out.println(getSpelledName("Zeynep") );
    }
public static String getSpelledName(String name){
String result="";

for(int x=0;x<name.length();x++ ) {
    result+=name.charAt(x) ;
      if(x!=name.length()-1) {
  result=result+"-" ;
      }
}return result ;
    }











}
