package day63Collection;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordFrequencyFromFile {
    public static void main(String[] args) {


        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/day63/map.txt"));
            System.out.println("allLines = " + allLines);

            String allLinesAsString = allLines.toString();


          //  Map<String, Integer> map = WordUtil.getFrequencyMap(allLinesAsString);
         //   System.out.println("map = " + map);


        } catch (IOException e) {
            System.out.println("ERROR@@@!!!!!");
        }


    }


}


