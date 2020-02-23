package day40;

public class SpaceShipComing {
    public static void main(String[] args) {
        // String name;
        // int yCordinate;
        //    int xCordinate;
        //String currentDrection;//up, down, left, right

        SpaceShip alpha=new SpaceShip();
        alpha.name="Beta";
        alpha.xCordinate=2;
        alpha.yCordinate=4;
        alpha.currentDrection="left";
alpha.setInitalPosition(3,4);
        System.out.println("alpha "+alpha);

        //        s1.setDirection("ABC");//
               alpha.move1Block();
               System.out.println("alpha " +alpha);
        //
                alpha.setDrection("ABC");
               alpha.move1Block();
        //
        System.out.println("alpha " +alpha);
        ////        // IF GIVEN WRONG DIRECTION , IT WILL NOT MOVE !!
        ////        s1.setDirection("ABC");
        ////        s1.move1Block();
        ////        System.out.println("s1 " + s1);
        ////        // IF GIVEN WRONG DIRECTION , IT WILL NOT MOVE !!
        ////        s1.setDirection("ABC");
        ////        s1.move1Block();
        ////        System.out.println("s1 " + s1);
        ////
        ////        s1.setDirection("down");
        ////        s1.move1Block();
        ////        System.out.println("s1 " + s1);
        //        s1.move1Block("up");
        //        s1.move1Block("right");
        //        s1.move1Block("up");
        //        s1.move1Block("down");
        //        s1.move1Block("HOME");
        //
        //        System.out.println("s1 = " + s1);


    }
}
