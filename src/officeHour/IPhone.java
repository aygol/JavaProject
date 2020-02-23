package officeHour;

public class IPhone extends Device {
    String platform;
    @Override
    public void sendMessage() {
        System.out.println("Hi from IPhone");
    }

}
