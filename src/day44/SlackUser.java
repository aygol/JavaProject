package day44;

public class SlackUser {
    //Create a class called SlackUser
    //attributes :
    protected String name;
    protected String status;

    //behaviours :
    public  void sendMessage() {
        System.out.println("SlackUser "+name+" sending  message");
    }

    public  void callSomeone() {
        System.out.println("SlackUser "+name+" call Someone");
    }

    public void addEmoji() {
        System.out.println("SlackUser "+name+" adding emogy");

    }
}