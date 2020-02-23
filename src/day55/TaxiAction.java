package day55;

public class TaxiAction {
    public static void main(String[] args) {
        Engine en=new Engine("V6",400);
        Driver d=new Driver("pedro",12344);
      //  System.out.println(d.name.charAt(0)); it come p


        Taxi t1=new Taxi(101,en,d);
        System.out.println("t1 = "+t1.toString());
        System.out.println("en = "+en);
        new Engine("V8",600);
        new Driver("John", 12346);
        System.out.println("Engine horse power is "+ t1.eng.horsePower);
    }
}
