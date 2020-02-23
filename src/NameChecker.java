import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
        {

            Scanner scan = new Scanner(System.in);

        //    if(name.lengthOfTheName()<=4) {
                System.out.println("short name");


       //     } else if (lengthOfTheName> 4 && name.lengthOfTheName < 11) {
                System.out.println("medium name");
      //      } else {
                System.out.println("longer name");
            System.out.println("Please enter your name?");
            String name = scan.next();
            //    int lengthOfTheName=name.lenghth();

            System.out.println();
            if (name.contains("a") || name.contains("a")) {
                System.out.println("name contains a or e");

        }else {
                System.out.println("I do not have a or e in my name");
            }
        String name1="Arya Stark";
      String uppercaseName=name1.toUpperCase();
            System.out.println(" uppercaseName contains ST or not?"+uppercaseName.contains("ST"));
            String lowercaseName=name1.toLowerCase();
            System.out.println(" lowercaseName contains st or not?"+lowercaseName.contains("st"));





        }}}
