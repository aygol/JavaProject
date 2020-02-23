package day12;

public class LogIn {
    public static void main(String[] args) {

        String userNumber="user123";
        String password="pass123";

        if(userNumber.equals("user123") && password.equals("pass123")) {


            System.out.println("login Sucessfull");
        } else if(userNumber.equals("user123") && !password.equals("pass123")){

            System.out.println("Your password is wrong!!");

        }else if(!userNumber.equals("user123") && password.equals("pass123")) {
            System.out.println("Your Username is wrong!!");

        } else{
            System.out.println("Your Username, and Your password are wrong!!");


     }

}}

