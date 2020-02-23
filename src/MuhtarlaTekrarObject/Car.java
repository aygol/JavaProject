package MuhtarlaTekrarObject;

public class Car {
String Model;
int Year;
String brand;
String color;
double price;
long millage;
double VIN;
public void drive(){
    System.out.println(brand+" is driven");
}public void start(){
        System.out.println(brand+" getting starting ");
    }public void getInfo(){
        System.out.println(Year+" "+brand+" "+Model+", "+color+" "+millage+ ", $"+price);
    }

}