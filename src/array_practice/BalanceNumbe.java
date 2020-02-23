package array_practice;

public class BalanceNumbe {
      public static String balancedNum(long number) {

          int count = 0;
          int count1 = 0;
          String s = Long.toString(number);
          for (int i = 0; i < s.length() / 2; i++) {
              count += s.charAt(i);
          }
          for (int j = s.length() / 2+1 ; j < s.length(); j++) {
              count1 += s.charAt(j);
          }
          if (count != count1) {
              System.out.println(count+" "+count1);
              return "unBalanced (count+\" \"+count1)";
          //    return "Do your magic!";
          }return "Balance";

      }

    public static void main(String[] args) {
          long number=1234123;
        System.out.println(balancedNum(number));//balancedNum(long number);
    }}
