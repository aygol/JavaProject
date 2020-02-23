package ReplyIt;

public class ReplyPramitHollow {
    public static void main(String[] args) {
        printHollowRect();
    }


    //*****
//*   *
//*   *
//*   *
//*****
//
//hint:you will need to use two nested for loops for that, and an if that checks if its the last or first iteration of the loop (so you will know whet
    public static void printHollowRect() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)   {



                }
             if (i == 0 || i == 4) {
                System.out.println("*****");
            } else {
                System.out.println("*   *");
        }
    }
}}