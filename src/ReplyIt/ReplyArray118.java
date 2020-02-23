package ReplyIt;

import java.util.Scanner;

public class ReplyArray118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
            //Cloudflare Ray ID: 542f75c11f36e958 • Your IP: 2601:586:200:70:28c8:8a39:271a:870f • Performance & security by Cloudflare
            }
            //leave above alone! :)
            //assume you have String array of 6 items
            //and print three neibouring items at a time till last item
            //write your code below

            for(int j=0; j<6; j++){

                System.out.println(arr[j]+" , "+arr[j+1]+" , "+arr[j+2]);
        }

    }
}
