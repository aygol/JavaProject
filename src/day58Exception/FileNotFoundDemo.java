package day58Exception;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {

    public static void main(String[] args) {

        System.out.println("Before try catch");
           try{     Files.readAllLines(Paths.get("file.txt"));
               System.out.println("&&&&&&");}//it did not print this
           catch(IOException e){
               System.out.println(" ***");//it print this
           }
            }
        }