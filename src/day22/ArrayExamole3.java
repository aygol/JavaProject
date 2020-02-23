package day22;

public class ArrayExamole3 {
    public static void main(String[] args) {

         double[] prices=new double[5];
        System.out.println(0);
      //  System.out.println(prices); [D@7b23ec81 this is come if you print variable prices.you cannot se what is inside
        prices[0]=2.46;
        prices[1]=12.76;
        prices[2]=992.8;
        prices[3]=500;
        prices[4]=99.36;
        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);
        //create a char array all the letter in yourname  using each your character
        char[] name=new char[4];
        name[0]='A';
        name[1]='y';
        name[2]='s';
        name[3]='e';
        System.out.println(name[0]+""+name[1]+""+name[2]+""+name[3]);
    }
}
