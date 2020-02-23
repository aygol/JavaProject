package officeHour;

public class Samsung extends Device{
    String color;

    @Override
    public void sendMessage() {
        System.out.println("Sending message with "+color);
    }

    @Override
    public void call() {
     //   super.call();
        System.out.println("Calling with Samsung");

    }
}
