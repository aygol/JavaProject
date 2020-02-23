package day02;

public class Gulay {
    public static void main(String[] args) {
        String email = "Random.Emails@gmail.com";
        int at = email.indexOf("@");
        int dot = email.indexOf(".");
        int ending = email.indexOf(".com");
        String emailType1 = email.substring(0,dot);
        System.out.println(emailType1);
        String emailType2 = email.substring(dot+1,at);
        System.out.println(emailType2);
        String gamil = email.substring(at+1,ending);
        System.out.println(gamil);
        String com = email.substring(ending+1);
        System.out.println(com);
    }
}
