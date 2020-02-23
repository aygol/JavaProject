package day44;

public class Vehicle {
    String make;
  private  int year;
    public void start(){
        System.out.println("Starting "+make);

    }public void goForward(){
        System.out.println(make+" is going forward ");
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
