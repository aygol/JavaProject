package day12;

public class LoginTest {
    public static void main(String[] args) {


        String userName="useName123";
        boolean userNameCorrect=userName.equals("ABC123");

        String password="pass123";

        boolean nameCheckIgnoreCase=userName.equalsIgnoreCase("ABC123");
        System.out.println(nameCheckIgnoreCase);
        String name="Ayse";
boolean nameCIgnoreCase=name.equalsIgnoreCase("ayse");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameCIgnoreCase);
        System.out.println(name.equalsIgnoreCase("aYsE"));





        }
}
