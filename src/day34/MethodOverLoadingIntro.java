package day34;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {
        System.out.println("Method overloading");
        System.out.println(12);
        String name="Overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));
   //two version of indexOf method (there are 4)
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));
  sayHello();
  sayhello("universe");
  sayhello("Ceylin and Nese");
  sayHello(100);
  sayHello('b',15);
  sayHello('*',2020);
        System.out.println( sayHello( "Ahmet","Golcu"));
    }public static void sayHello(){
        System.out.println("Hello, World");
    }public static void sayhello(String name){
        System.out.println("Hello, "+name);


    }public static void sayHello(int num){
        System.out.println("Hello, "+ num);
    }public static void sayHello(char ch , int num){
        System.out.println("Hello, "+ch + num);

}public static String sayHello( String firstName,String lastName){

        return "Hello, "+firstName+" "+lastName;
    }
}
