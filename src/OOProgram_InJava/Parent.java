package OOProgram_InJava;

public class Parent  {

   // public static void main(String[] args) {//public class Parent extends Object
    // { if we extended it comes all method from parent class
   //     System.out.println("java");

String name;
int age;
int SSN;
//methods actions
 public    Parent (){
     name="Unknown";
     age=-1;
     SSN=-1;
 }
    public Parent (String name, int age,int SSN){
    this.name=name;
    this.age=age;
    this.SSN=SSN;
    }

    public void cooking(String foodName){
        System.out.println("cooking "+foodName);
    }
public static void hi(){
    System.out.println("hello hello");


}public static void hi(String name) {
        System.out.println("hello hello");

    } public static String hello(){
        return "hello hello";}
public static void main (String[]args){  //you can overloaded main method public static void main(){}
    //public static boolean main(int number) (int number){}
    hi();
    //call return method --> 2 ways to call it
    System.out.println(hello());
    }
}

