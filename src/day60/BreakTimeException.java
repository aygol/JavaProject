package day60;

public class BreakTimeException extends RuntimeException {


}class Main{
    public static void main(String[] args) {
        throw new BreakTimeException();//you can give exception name example UserNameWrongException
    }
}
