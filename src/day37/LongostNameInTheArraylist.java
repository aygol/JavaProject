package day37;

import java.util.ArrayList;
import java.util.List;

public class LongostNameInTheArraylist {
    public static void main(String[] args) {
        List<String> listName=new ArrayList<>();

listName.add("Ayse");
listName.add("Abdurrahman");
listName.add("Ahmet");
listName.add("Furkan");
listName.add("Ali");
listName.add("Ceylin");
listName.add("Nese");
        listName.add("AhmetGolcu*");
String longestName=listName.get(0);

for(int i=0; i<listName.size();i++){
if(longestName.length()<listName.get(i).length() ){
   longestName= listName.get (i) ;

}}
        System.out.println("who is number 1 "+ longestName);
listName.add("AhmetGolcu*");
     //   listName.add("NeseSeymaGolcu*");
String currentLong="";
        for(int i=0; i<listName.size();i++){
            if(longestName.length()<=listName.get (i).length() ){
               currentLong= listName.get (i);
                System.out.println();
}}System.out.println(currentLong);}}
