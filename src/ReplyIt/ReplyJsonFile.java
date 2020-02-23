package ReplyIt;

import java.util.Scanner;

public class ReplyJsonFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
        String json = scan.nextLine();

        int fn = json.indexOf("firstName");
        int fncomma = json.indexOf(",", fn); //first comma after first name
        int ln = json.indexOf("lastName");
        int lncomma = json.indexOf(",", ln); //first comma after last name

        System.out.println("First name: " + json.substring(fn+13, fncomma-1));
        System.out.println("Last name: " + json.substring(ln+12, lncomma-1));

    }
}

