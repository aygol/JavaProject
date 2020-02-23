package officeHour;

public class OfficeHours {
    public static void main(String[] args) {

String mainOptions="bed";
        String secondOptions="sad";
if(mainOptions.equalsIgnoreCase("food")){
    System.out.println("You selected food");

    if(secondOptions.equalsIgnoreCase("snack")) {
        System.out.println("You selected snack");
    }else if(secondOptions.equalsIgnoreCase("meal")) {
        System.out.println("You selected meal");
    }else{
        System.out.println("No such food option");
    }

    }
}}
