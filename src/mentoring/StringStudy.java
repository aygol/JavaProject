package mentoring;

public class StringStudy {
    public static void main(String[] args) {
        //

          String x="Ayse" ;
          String z="Ayse";
          String f=new String("Olivia");
           System.out.println(x==z);//true
           System.out.println(x==f);//false
           System.out.println(x.equals(f));//true
     int length=         f.length();
        System.out.println(length);
        //  012345
        //f="Olivia;
char ch=f.charAt(0);
char ch1=f.charAt(1);
        System.out.println(ch+""+ch1);//int  asci// 187
        f.toUpperCase().equals("Olivia");
        f.contains(ch+"");//String contains method String de string var
        System.out.println(f.substring(0));//Olivia
        System.out.println(f.substring(3));//via
        System.out.println(f.substring(0,3));//Oli
        System.out.println(f.substring(0,1));//O
        System.out.println(f.substring(4,5));//i
       String tr="";
        String key=" ";
        System.out.println(key.isEmpty());//false
        System.out.println(tr.isEmpty());//true
        String baslukmu=  key.trim();
        System.out.println(key.isEmpty());
      //  System.out.println(baslukmu.isEmpty());
String m="  Bosluk  ";
     String mx=m.trim();
        System.out.println(mx);
        System.out.println(key.isBlank());
        System.out.println(mx.isBlank());
        System.out.println(f.startsWith("O"));//true
        System.out.println(f.startsWith("OL"));//false
        System.out.println(f.startsWith("Oli"));//true
        System.out.println(f.replace('O','l'));
       }
        }


