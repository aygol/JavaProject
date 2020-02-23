package array_practice;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Have a good day!!";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        String str2 = "The quick brown fox";
        System.out.print("Before reversing : " + str2);
        char[] letters = str2.toCharArray();
        System.out.print("After reversing : ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}