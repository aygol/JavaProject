package homeWork;

public class HarflerUnique {
    public static void main(String[] args) {
        String name="AAABBBCCCDDHHHH";
        unique(name);
    }

    public static void unique(String str) {
        String uniqeStr = "";
        for (int i = 0; i < str.length(); i++) {
                   //
            if (!uniqeStr.contains("" + str.charAt(i))) {
            uniqeStr += str.charAt(i);}}



        for (int k = 0; k < uniqeStr.length(); k++){
       int     counter=0;
       for (int i = 0; i < str.length(); i++) {
            if (uniqeStr.charAt(k)==(str.charAt(i ))) {
                counter++;

            }

        }System.out.print(uniqeStr.charAt(k)+"= " + counter);
    }
}}