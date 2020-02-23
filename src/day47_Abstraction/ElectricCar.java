package day47_Abstraction;

public class ElectricCar extends Car {

    int batteryLevel;

    @Override
    public void start() {
      //  super.start();
        System.out.println("This is how electric car start");}


        public  void goForward(){
            System.out.println("Go forward");
        }


        public void goBackward() {
            System.out.println("Go Backward");
        }



        public  void turn(String direction){
                System.out.println("Go "+direction);
    }



   }



