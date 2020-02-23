package day59ExceptionAkbar;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            Object o=new String ("abc");
            System.out.println("try to solve");
        } catch (Exception e) {
            System.out.println("Catch the fish");
            e.printStackTrace();
        } finally {
            System.out.println("final decision");
        }

        // in some cases we want to run certain code
        // no matter exception happen or not
        // as part of try catch

        int[] nums = {1, 4, 6};

        try {

           System.out.println("nums[0] = " + nums[100]);
//throw new ArrayIndexOutOfBoundsException("index 100 out of bounds for length 3");
        } catch (Exception e) {
            // HOW DO I GET THE MESSAGE OUT OF THE EXCEPTION OBJECT
            // Any exception object (can) have message field
            // and it can be extracted by calling getMessage method
            System.out.println("Exception caught \n " + e.getMessage());

        } finally {
            System.out.println("THIS CODE WILL ALWAYS RUN NO MATTER WE HAVE EXCEPTION OR NOT ");
        }


        System.out.println("THE END ");


    }


}

