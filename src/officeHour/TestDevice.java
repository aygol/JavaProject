package officeHour;

public class TestDevice {
    public static void main(String[] args) {
      //  Device d= new Device();//d,s,i, is reference
        //new Device(),new Samsung , new IPhone
        Samsung s=new Samsung ();
        s.price=999;
        s.size=6;
        IPhone i=new IPhone();

        s.call();
        i.call();
        //reference d2 type parant class/interface
        //object (new SAMSUNG)TYPE IS CHILD CLASS

        Device d1=new Samsung();
        Device d2=new IPhone();
        WaterProof d3=new IPhone();
//TWO TYPE OF POLIMORPHISM
// 1) DYNAMING=
// 2)STATIC

    }
}
