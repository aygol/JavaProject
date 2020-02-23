package day35;

public class WrapperTypePrimitiveTypeConverting {
   int nextPage=1;
   String result="";

    public static void main(String[] args) {

Integer i1=new Integer (12);

        Integer i2=12;//Int 12  is auto-boxed to Integer i2
        int i3=i1;//Integer i1 is auto-unboxed to int 12
        Double d1=3.14;//double 3.14 is auto-boxed to double d1
        Integer num1=100;//outo-boxing 100-->new Integer(100)
        int num2=Integer.valueOf("200");//auto -unboxing into 200
       // int num3= "200";this cannot happened itself
        //int num3="200";
        int num=Integer.parseInt("100");
        /* Integer.valueOf("NUMBERHERE");
        IT RETURN AN INTEGER OBJECT BY WRAPPING UP THE NUMBER

        Integer.parseInt("NUMBERHERE"); IT RETURN AN INT VALUE CONVERTED FROM STRING
        YOU MAY USE WHICHEVER YOU WANT BECAUSE: AUTO-BOXING AND AOUTO -UNBOXING WILL TAKE CARE OF THE CONVERSION ANYWAY
         */
        //use this number IPR2012-00001 and store the year into a int variable
        String caseNumber="IPR2012-00001";
        int year ;//get 2012 out of it
        year=Integer.parseInt(caseNumber.substring(3,7));
        System.out.println(year);
        float f6=Float.parseFloat("3.14");
        System.out.println(f6);

    }public static int getYearOutOfCaseNumber(String caseNumber){
        return Integer.parseInt(caseNumber.substring(3,7));
        //// Use this number IPR2012-00001 and store the year into a int variable
        //// This case number always start with 3 character either IPR , PGR , CBM , DER
        //// followed by year , followed by dash and 5 digit number
        //String caseNumber = "IPR2012-00001" ;
        //int year ; //-- get 2012 out of it





    }public void addChapter(String titleOfTheChapter,Integer numberOfThepages){
        result+=titleOfTheChapter+numberOfThepages;
        nextPage+=Integer.valueOf(numberOfThepages);
    }
}
