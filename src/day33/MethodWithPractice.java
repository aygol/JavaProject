package day33;

public class MethodWithPractice {
    public static void main(String[] args) {


    }
        public static String fullNameToGotEmail(String fullName){
            int indexOfSpace=fullName.indexOf(" ");
            char firstChar=fullName.charAt(0);
            String lastName=fullName.substring(indexOfSpace+1);
            String email=firstChar+""+lastName+"@NightWatch.com";
            return email;
        }
}
