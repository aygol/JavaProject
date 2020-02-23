package day44;

import org.w3c.dom.ls.LSOutput;

public class Train extends Vehicle {
    int wagonCount;

    @Override
    public String toString() {
        return "Train{" +
                "wagonCount=" + wagonCount +
                ", make='" + make + '\'' +
                '}';
    }





    public void makeChoChoSound(){
        System.out.println("Choooooo choooo");

    }

    public static void main(String[] args) {
        Train t1=new Train();
        t1.makeChoChoSound();
        t1.wagonCount=40;
        t1.setYear (1999);
        t1.make= "Thomas" ;
        t1.start();
        t1.goForward();
        System.out.println( t1.toString());
    }
}
