package day64;

import java.util.LinkedList;
import java.util.*;

public class DeQueDemo {
    public static void main(String[] args) {
        Deque<String> lifoQue=new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("Do your Homework");
        lifoQue.add("Attend the class ");
        lifoQue.add("Say bye to Java");
        lifoQue.add("Say bye to Java");
        System.out.println("lifoQue = "+lifoQue);
        System.out.println("lifoQue.removeLast() = "+lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = "+lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = "+lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = "+lifoQue.removeLast());

        System.out.println("lifoQue = "+lifoQue);
        System.out.println("lifoQue = "+lifoQue);
    }
}
