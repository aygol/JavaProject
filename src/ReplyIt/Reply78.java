package ReplyIt;

import java.util.Scanner;

public class Reply78 {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        //We have a message variable already declared and assigned value in this format
        //Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
//Sender: Mike Smith
//Phone Number: 202-123-3456
//Message body: I love programing and problem solving
        System.out.println("Sender: "+message.substring(message.indexOf("<")+1,message.indexOf(">")));
        System.out.println("Phone Number: "+message.substring(message.indexOf("[")+1,message.indexOf("]")));
        System.out.println("Message body: "+message.substring(message.indexOf("{")+1,message.indexOf("}")));
    }}