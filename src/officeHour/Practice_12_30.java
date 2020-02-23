package officeHour;

public class Practice_12_30 {
    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    //    parse methods: converting primitive
    //    Valuof methods converting wrapper class
        String str="123";//parse methods  Not CASE sensitives
        int result=Integer.parseInt(str);
        System.out.println(result+1);//124
String str2="true";
Boolean r1=Boolean.parseBoolean(str2);
        System.out.println(r1);
 String str3="FalSe" ;
 Boolean r2=Boolean.parseBoolean(str3);
        System.out.println(r2);//false
String str4="Yes"  ;//anything than true gives false
        Boolean r3=Boolean.parseBoolean(str4);
        System.out.println(r3);//false
  String s1="100.5" ;
  Double d1=Double.parseDouble(s1);//auto boxing
        System.out.println(d1+2);
        //ValueOf
Double d2=Double.valueOf(d1);
        System.out.println(d2+2);
    }
}
