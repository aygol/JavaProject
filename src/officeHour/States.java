package officeHour;

public abstract class States {
    public abstract void Tax();
    public final void method1(){
        System.out.println("method1 from States class");
    }
public class Kentucky extends States{
    String stateName="KA";
    @Override
    public void Tax() {
        System.out.println("Tax rate in Kentucky  is %6 ");
    }public void KFC(){
        System.out.println(" KY has KFC");
    }   public final void method1(int a) {
        System.out.println("method1 from Kentucky");
    }
 class California extends States{
     String stateName="CA";

     @Override
     public void Tax() {
         System.out.println("Tax rate in California is %9");
     }
 }
}
}
