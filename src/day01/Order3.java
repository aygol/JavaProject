package day01;
import java.util.Scanner;
public class Order3 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        int areaCode=input.nextInt();
        int localNumber=input.nextInt();
        String phoneNumber="("+areaCode+")"+"-"+localNumber;
        System.out.println("Calling number "+phoneNumber);








    }public int sum13(int[] nums) {
        int count = 0;
        int sum = 0;

        while (count < nums.length) {
            if (nums[count] == 13) {
                nums[count + 1] = 0;
                nums[count] = 0;
                sum = +nums[count];
                count++;
            }
        }
        return sum;
    }}
