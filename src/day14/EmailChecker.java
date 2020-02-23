package day14;

public class EmailChecker {
    public static void main(String[] args) {
 /*Create a class called EmailChecker with main method:
create a variable called email
check for below conditions
if it does not contain character @  say invalid email
if it contain space say invalid email
if it endsWith @gmail.com  -->> gmail
if it endsWith @yahoo.com  -->> yahoo email
if it endsWith @mail.ru  -->> russian email*/


        String email = "abcd@gmail.com";

        if (!email.contains("@") || email.contains(" ")) {

                System.out.println("Invalid email");

            }else if (email.endsWith("@gmail.com")) {
            System.out.println("Google Mail");
            }else if(email.endsWith("@Yahoo.com")){

            System.out.println("Yahoo Mail");
        }else if(email.endsWith("@mail.ru")){
            System.out.println("Russian Mail");
            }
        }
    }