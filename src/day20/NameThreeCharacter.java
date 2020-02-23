package day20;

public class NameThreeCharacter {
    public static void main(String[] args) {
        String name = "Ayra";
        int lastCharIndex = name.length() - 1;

        for (int x = 0; x <= lastCharIndex -2; x++) {
            System.out.println(name.substring(x, x + 3));
        }
    }
}