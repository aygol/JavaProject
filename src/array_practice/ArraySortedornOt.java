package array_practice;

public class ArraySortedornOt {
    public static void main(String[] args) {
        int[] nums={13,31,8,5,21,2} ;
        boolean isSorted=true;
        for(int x=0; x<nums.length-1;x++) {
            System.out.println("is " + nums[x] + " less than  " + nums[x + 1] + " ?" + (nums[x] < nums[x + 1]));
            if ((nums[x] > nums[x + 1])) {
                System.out.println("Its not sorted");
                isSorted=false;
                break;


            }


        }
        System.out.println("It is already sorted= "+isSorted);
    }



    }

