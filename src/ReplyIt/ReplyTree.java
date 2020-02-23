package ReplyIt;

public class ReplyTree {
    public static void main(String[] args) {
        int grow=0;
        int treeSize=0;
        int age=0;
        for(int i=1; i<=10; i++) {//year 1 - growth 1 cm
            if (age + i <=3) {

                treeSize =treeSize+1;
                System.out.println("year " + i + " - growth 1 cm");
                System.out.println("tree size: " + treeSize + " cm");
                if (age +i>=4) {
                    treeSize =treeSize+2;
                    System.out.println("year " + i + " - growth 2 cm");
                    System.out.println("tree size: " + treeSize + " cm");
                }

            }

        }}}

