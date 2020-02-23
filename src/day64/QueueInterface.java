package day64;

import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {
        Queue <String>taskQueue=new LinkedList<>();
        taskQueue.add("review the class");
        taskQueue.add("Do your Homework");
        taskQueue.add("Attend the class ");
        taskQueue.add("Say bye to Java");
        taskQueue.add("Say bye to Java");
        System.out.println("taskQueue = "+taskQueue);
        System.out.println("taskQueue.remove() = "+taskQueue.remove());
        System.out.println("taskQueue.remove() = "+taskQueue.remove());
        System.out.println("taskQueue.remove() = "+taskQueue.remove());
        System.out.println("taskQueue.remove() = "+taskQueue.remove());

        System.out.println("taskQueue.remove() = "+taskQueue.remove());
        System.out.println("taskQueue = "+taskQueue);
    }
}
