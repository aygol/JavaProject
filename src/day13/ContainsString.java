package day13;

public class ContainsString {
    public static void main(String[] args) {
       String name="Abdurrahman";
        boolean a=name.contains("rahman");
boolean b=name.contains("se");

        System.out.println(a);
        System.out.println(b);

 String x1= name.substring(1,2);
        String x2= name.substring(0,3);
        String x3= name.substring(3,4);
        String x4= name.substring(4,6);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
      boolean s1=name.startsWith("Abd");
        boolean s2=name.startsWith("man");
        boolean s3=name.startsWith("Ab");
        boolean s4=name.startsWith("rh");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


    }
}
