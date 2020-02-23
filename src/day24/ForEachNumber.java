package day24;

public class ForEachNumber {
    public static void main(String[] args) {
        int yourFavNUmber=300;
        int myfavNumber=yourFavNUmber;
        myfavNumber=299;
        System.out.println(yourFavNUmber);
        long[] nums={10,40,20};
        nums[0]=nums[0]*2;

         for(int x=0; x<3; x++){
            System.out.println(nums[x]*2);}
            System.out.println("After we modify the value");
            for(int x=0; x<3; x++){
                System.out.println(nums[x]);

        }










    }
}
