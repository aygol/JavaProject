package day21;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            break;
        } {
            int sum=0;
            for (int x= 1; x <= 10; x++) {
               sum=sum+x;
                System.out.println(x);
                if (sum+x > 12){
                    break;}
                sum=sum+x;
            }
            System.out.println(sum+"sum");
}}}
