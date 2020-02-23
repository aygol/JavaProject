package day47_Abstraction;

public class Practice {


    private void doSomething() {
    }
    }class JavaPractice extends Practice{
    //@Override if super class method private we cannot override that method
 public  void doSomething() {

 }

    public static void main(String[] args) {
        int x=10;
        x=100;
        final int y=20;
      //  y=30; you cannot change the value for y variable you connot re-assign new value to the variable
    }

}
