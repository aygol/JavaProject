package array_practice;

public class RverseNumber{
    public static void main(String[] args) {
        int num =4000032;
      int  reverse=0;
      int reminder=0;
      while(num!=0){
      reminder=num %10;//2
      reverse=reverse*10+reminder;

       num=num/10;
    }
        System.out.println(reverse);

}}
