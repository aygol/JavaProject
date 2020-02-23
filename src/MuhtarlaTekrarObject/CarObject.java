package MuhtarlaTekrarObject;

public class CarObject {
    public static void main(String[] args) {
        Car car1=         new Car();//default constractor
 //Class name*ObjectName keyWord*Contractor
car1.brand="BMW";
car1.color="White";
car1.millage=12342;
car1.Model="X6";
car1.price=15000;
car1.Year=2000;
        System.out.println(car1.brand);//default value comes if you did not give value it comes null
       Car car2=new Car();
        car2.brand="Toyota";
        car2.color="Black";
        car2.millage=12060;
        car2.Model="Corolla";
        car2.price=15000;
        car2.Year=2002;
        System.out.println(car2.brand+"| "+car2.Model+"| "+car2.Year);
car1.drive();//
        car2.drive();
        car1.start();
        car2.getInfo();
        Car car3=new Car();
        car3.brand="Lexus";
        car3.Model="RX350";
        car3.millage=2500;
        car3.Year=2020;
        car3.color="Purple";
    }
}
