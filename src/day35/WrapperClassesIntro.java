package day35;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int x=10;
        //primitive data type pure values has no attribute or behavior
        //each primitive type has wrapper class that return it into object treat it
        ;// this is the old not recomended way of create Integer Object
        Integer x1=new Integer(12);
        System.out.println("Integer x1=new Integer(12)**x1 = "+x1);
        Integer xObj2=Integer.valueOf(10);
        Integer xObj3=Integer.valueOf("10");
       byte bValue= xObj2.byteValue();
       System.out.println("   byte bValue= "+ bValue);
       double dValue= xObj2.byteValue();
       System.out.println("   double dValue= "+ dValue);


    }

}
