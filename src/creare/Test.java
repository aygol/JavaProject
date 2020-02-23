package creare;

public class Test {
    //  public static void main(String[] args) {
    public boolean xyzThere(String str) {
        String str1 = "xyz";

        for (int i = 0; i < str.length() - 2; i++) {
            if (("" + str.charAt(i) + str.charAt(i + 1) + str.charAt(i + 2)).equals("xyz") && !str.startsWith(".")) {

                return true;
            }}
            return false;

    }
}








