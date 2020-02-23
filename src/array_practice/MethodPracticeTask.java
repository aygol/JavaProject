package array_practice;

import java.util.Scanner;

public class MethodPracticeTask {
    public static void main(String[] args) {
        //Write a method that validates the new password user enters while user is changing his/her account password. First, print below password rules to the user:
        //"The password must be:
        //-at least eight characters long
        //-contain an uppercase letter
        //-contain a special character
        //-not contain the username
        //-not be the same as the old password"
        //Then, use Scanner to prompt user to input the following:
        //Enter your username:
        //Enter your old password:
        //Enter your new password:
        //Validate the complexity of the new password by assuring it meets above requirements.
        //If it meets all requirements, print "Password changed successfully!",
        // if not print "Invalid password! Try again!" and prompt the user to enter above information again
        // and this process should automatically repeat until user enters a valid password.
        changingPasword();
    }public static void changingPasword(){


        Scanner input = new Scanner(System.in);
        System.out.println("\"The password must be:\n" +
                "         * -at least eight characters long\n" +
                "         * -contain an uppercase letter\n" +
                "         * -contain a special character\n" +
                "         * -not contain the username\n" +
                "         * -not be the same as the old password\"");

        System.out.println("Enter your username:");
        String user = input.next();
        System.out.println("Enter your old password:");
        String oldPwd = input.next();
        System.out.println("Enter your new password:");
        String newPwd = input.next();

        int specialCnt = 0;
        int uppercase = 0;

        for (int i = 0; i < newPwd.length(); i++) {
            if (Character.isUpperCase(newPwd.charAt(i))) {
                uppercase++;
            }else if (!Character.isLetterOrDigit(newPwd.charAt(i))
                    && !Character.isWhitespace(newPwd.charAt(i))) {
                specialCnt++;
            }
        }

        if(newPwd.length() >= 8 && !newPwd.equals(oldPwd) && !newPwd.contains(user)
                && specialCnt >= 1 && uppercase >= 1){
            System.out.println("Password changed successfully!");
        }else{
            System.out.println("Invalid Password. Try again!");
            changingPasword();
        }

    }
           }




