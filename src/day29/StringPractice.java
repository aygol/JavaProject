package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark J Kent";
        //hide this hero identity
        //      String heroX ="Superman-************:
        //given aString eith hero code anf name seperateed by --turn this String intro hero code * with same length as hero name
        //logic:split it by- to get the code and full name get thr length of full name generate stars with same length as full name character count concatenete herocode with dash and stars and dave it
//or one the star is genreteed replace full name with Stars
        String[] heroSpliteted = hero1.split("-");
        String heroCode = heroSpliteted[0];
        String fullName = heroSpliteted[1];
        int nameCharCount = fullName.length();
        String stars = "";
        for (int i = 0; i < nameCharCount; i++) {
            stars += "*";

        }
        System.out.println(fullName);
        System.out.println(stars);
        String herox=heroCode+"-"+stars;
        System.out.println(hero1);
        System.out.println(herox);






    }
}