package day06;
import java.util.Scanner;
public class AskingOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int studentOnline=263;
       studentOnline=studentOnline+5;
        System.out.println("5 people joined the class "+studentOnline);
        studentOnline=studentOnline-3;
        System.out.println("3 people left the class "+studentOnline);
        studentOnline=studentOnline+studentOnline;//studentOnline*2 de olabilir
        System.out.println("the student doubled "+studentOnline);

        studentOnline=studentOnline/3;
        System.out.println("the student droped 1/3 : "+studentOnline);


    }
}
