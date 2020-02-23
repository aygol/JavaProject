package day11;

public class LogicalOparatorSingle {
    public static void main(String[] args) {

        System.out.println(7>5 & 1>7);
        System.out.println(5>5 & 1>7);
        System.out.println(1>5 & 9>7);
        System.out.println(7>5 && 1>7);
        System.out.println(5>5 && 1>7);
        System.out.println(1>5 && 9>7);


        System.out.println(5>10 && 9/0==3);

        System.out.println(5>10 & 9/0==3);
        System.out.println();
        System.out.println(5>10 || 9/0==3);

        System.out.println(5>10 | 9/0==3);
        System.out.println();
        System.out.println(5<10 || 9/0==3);

        System.out.println(5<10 | 9/0==3);
        System.out.println("LOGICAL NOT OPERATOR");
        System.out.println(true);
        System.out.println(!true);
        System.out.println(false);
        System.out.println(!false);
        boolean isRecording=false;
        System.out.println(!isRecording );
        System.out.println(!(7>5));








    }
}
