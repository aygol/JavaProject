package day11;

public class LogicalOperations {
    public static void main(String[] args) {

   //x>60 &&(ampersands)x<100
     /*   int x=70; x>60&& x<100; true    int x==110 x>60&& x<100; false        int x= 99 x>60&& x<100;true

 ||  OR   x>60||(pipe) x<100; int=110  true;   as long as one is true its true.
        x= 7  x>60 || x<100; true intx=7 x>10 ||x<5 false

      */
        System.out.println("TRUE && TABLE");
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println();
        System.out.println("TRUE || TABLE");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true ||false);
        System.out.println(false || false);
int num =10;
        System.out.println(num<10||num >100);
        int num1 =60;
        System.out.println(num1<10||num1 >100);
        int num3 =110;
        System.out.println(num3<10||num3 >10);
        System.out.println(num<10&&num >100);

        System.out.println(num1<10&&num1 >100);

        System.out.println(num3<10&&num3 >100);

        System.out.println();
        System.out.println(true ||false||false);//true
        System.out.println(true &&true&&false);//false
int x=55;
        System.out.println(x>50 && x!=52 ||x==57);//x is more than 50 and x is not equal to 52 or x equal to 57

    }
}
