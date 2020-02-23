package day11;

public class RoomCharoption {
    public static void main(String[] args) {


        char targetOption = 'b';
        switch (targetOption) {
            case 'b':
                System.out.println(" You have turned on Bedroom Light ");
                break;
            case 'l':
                System.out.println(" You have turned on Living Room");
                break;
            case 'k':
                System.out.println("You have turned on Kitchen");
                break;
            case 'h':
                System.out.println(" You have turned on Hallway");
                break;
            default:
                System.out.println("Invalid Operator ");
                break;
        }
    }
}

















