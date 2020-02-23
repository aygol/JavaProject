package ReplyIt;

public class Method_Task_tekrar {
    public static void main(String[] args) {
        System.out.println(  build3DigitNumber(1,6,5));
        System.out.println(  build3DigitNumber(7,6,9));
        System.out.println(  build3DigitNumber(11,2,8));
        int result1= build3DigitNumber(1,6,5);
        System.out.println("result1 = "+result1);
        int result2= build3DigitNumber(19,6,5);
        System.out.println("result2 = "+result2);
        int result3= build3DigitNumber(1,69,50);
        System.out.println("result3 = "+result3);
        //1, write a method called build3DigitNumber
        //   it has 3 int parameters digit1 digit2 digit3
        //   and it will return the 3 digit numbers you have build
        //   if any of digit1 digit2 digit3 is not within the range of 0-9 the change it to 0 ,
        //   for example :
        //   build3DigitNumber(4,2,4) --->> 424
        //   build3DigitNumber(0,2,1) --->> 21
        //   build3DigitNumber(65,6,9) --->> 69

    }public static int build3DigitNumber(int digit1,int digit2 , int digit3) {
        int number = 0;
        if (digit1<0||digit1>9)digit1=0;
        if (digit2<0||digit2>9)digit2=0;
        if (digit3<0||digit3>9)digit3=0;
                    number = (digit1 * 100) + (digit2 * 10) + (digit3);
                    return number;

                }
            }
