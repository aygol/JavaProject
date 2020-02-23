package day05;
import java.util.Scanner;
public class TheScannerWay {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        //Scanner scan=new Scanner(System.in);
        /*String name=scan.next();

        System.out.println("What is your birth date?");
        int birthDate=scan.nextInt();
        System.out.println("What is your height");
        int height=scan.nextInt();
        System.out.println("Your name is"+" " +name+" "+", your birth date is"+" "+ birthDate+" "+"and your height is"+" " +height );
        System.out.println("Are you recording");
        boolean isRecording= scan.nextBoolean();
        System.out.println("We are recording"+" "+isRecording);*/
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome the Grader!");
        System.out.println("Math");
        double math = scan.nextDouble();
        System.out.println("Biology");
        double biology = scan.nextDouble();
        System.out.println("English");
        double english = scan.nextDouble();
        System.out.println("Chemistry");
        double chemistry = scan.nextDouble();
        System.out.println("Music");
        double music = scan.nextDouble();
        System.out.println("Summary: Math - "+math+", Biology - "+biology+", English - "+english+",  Chemistry - "+chemistry+",  Music - " +music);
        System.out.println("Your average score is:" + (math + biology + english + chemistry + music)/5);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");

    }
}
