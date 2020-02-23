package day39;

public class Car {
//car attribute :
    //  year , model, make, color
    //   bevavior
    //           goforwD GObackward, turnward,turnRigth,runLeft;

    String name;
    int year;
    String model;
    String color;

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.model = "4runner";
        c1.color = "Silver";
        c1.name = "Tesla";
        c1.year = 2019;
        c1.goForward();
        Car c2 = new Car();
        c2.name = "Hundai";
        c2.model = "SanteFe";
        c2.year = 2020;
        c2.color = "black";
        c2.goForward();

//instance methods are tied


        }public void goForward(){
          //  System.out.println(make+"Going forward");
    }
}


