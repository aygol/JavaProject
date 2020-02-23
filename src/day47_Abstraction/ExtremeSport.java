package day47_Abstraction;

public class ExtremeSport extends Sport {
 //   public void doSomething() {
  //      super.doSomething();//calling super class method   YOU CANNOT USE AS OVERRIDEN BECAUSE IT IS FINAL METHOD
  //      System.out.println("doing extreme sport");//COMPILE ERROR
    public void doSomethingElse(){
        System.out.println("doing something else in extreme spor");
        super.doSomething();
    }
}