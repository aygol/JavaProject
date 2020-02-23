package day31;

import org.w3c.dom.ls.LSOutput;

public class Day31 {
    public static void main(String[] args) {
   //     System.out.println("Hello World");
   //     System.out.println("My Name is Ayse");
   //     System.out.println("I love Java");
  //      System.out.println("_____________________________________________");

        sayHello();
        System.out.println("=================================");
        sayHello();
        System.out.println("=============The End==========================");
        //two way to create static method  external data if needed if you are in class
    }  //Do not create amethod inside main method

        public static void sayHello(){
            System.out.println("Hello World");
            System.out.println("My Name is Ayse");
            System.out.println("I love Java");
        }
    }

