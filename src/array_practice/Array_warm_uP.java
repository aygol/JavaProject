package array_practice;

public class Array_warm_uP {
    public static void main(String[] args) {
        //     find create an arra of 7 items
        //assign a value prinit out in reserve order
        //2 store last item in a variable called LastItem
        //print it out speraitly
        int[] nums = {1, 3, 4, 5, 8, 9, 4};


        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print("reverse order " + nums[i]);
            System.out.print("->");
        }
        System.out.println("****");
        int lastItem = nums[nums.length - 1];
        System.out.println("Last Item value " + lastItem);
        System.out.println("middle item index value=" + nums[nums.length / 2]);
        int sum = 0;
        for (int x = 0; x < nums.length; x++) {

            sum = sum + nums[x];
        }
        System.out.println("sum= " + sum);
        int max =nums[0];
        for (int eachnums : nums) {
        if(eachnums>max){
            max=eachnums;
        }

        }
        System.out.println("max value = "+max);
        int min=nums[0];

        for(int eachnums:nums){
            if(eachnums<min){
         min=eachnums;
            }
        }
        System.out.println("min = "+min);
    }
}







