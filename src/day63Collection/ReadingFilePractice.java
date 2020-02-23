package day63Collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadingFilePractice {
public static void main(String[]args) throws IOException {

    List<String> allData=Files.readAllLines((Paths.get("C:\\Users\\golcu\\IdeaProjects\\JavaProgramingB15online\\src\\day63Collection\\employeeData.txt")));
    Map<Integer,String>idNamePair=new HashMap<>();

    for(String eachLine:allData){
       System.out.println("eachLine = "+eachLine);
       String line ="1, Lilian";
       int id=Integer.parseInt(line.split(",")[0]);
       String name=line.split(",")[1];
      // System.out.println("id is "+id);
     //  System.out.println("name is "+name);
       idNamePair.put(id,name);

   }
    System.out.println("idNamePair = "+idNamePair);
    System.out.println("idNamePair.get(20) = "+idNamePair.get(20));




        }
        }