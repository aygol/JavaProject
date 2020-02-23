package day21;

public class DecidingWhenTOstop {
    public static void main(String[] args) {
        String msg = "Hello World";
        int charCount = msg.length();

        //int countOfCharToIterate=1;//x<= charCount-n
        int n = 3;
        for (int x = 0; x <= charCount - n; x++) {
            System.out.println(msg.substring(x,x+n));
        }
    }
}