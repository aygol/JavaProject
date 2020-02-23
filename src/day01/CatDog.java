package day01;

public class CatDog {

    public static boolean catDog(String str) {
        String str1 = str;

        int countDog = 0;
        int countCat = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
     //       System.out.println(countCat);
        }
        for (int i = 0; i < str1.length() -2; i++) {
            if (str1.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
       //     System.out.println(countDog);
        }
        if (countCat == countDog) {
            return true;
        }
        return false;

    }
    public static boolean endOther(String a, String b) {
     //   a.toLowerCase();
     //   b.toLowerCase();
        if( a.toLowerCase().contains(b.toLowerCase())||(b.toLowerCase().contains(a.toLowerCase()))){
            return true;
        }return false;
    }
    public static void main(String[] args) {
        System.out.println(endOther("AbC", "HiaBc"));
        // System.out.println(catDog("catdog"));
    //    System.out.println(catDog("1cat1cadodog"));
        String str = "ogcatcdecodecope";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'c') && (str.charAt(i + 1) == 'o') && (str.charAt(i + 3) == 'e')) {
                count++;
            }
        }
        System.out.println("*************");System.out.println(endOthers("AbC", "HiaBc"));}
       // System.out.println(count);
        public static boolean endOthers(String a, String b){
     if(a.toLowerCase().endsWith(b.toLowerCase())||b.toLowerCase().endsWith(a.toLowerCase())){
 return true;
}return false;




}}

