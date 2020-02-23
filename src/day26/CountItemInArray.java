package day26;

import java.util.Arrays;

public class CountItemInArray {
    public static void main(String[] args) {

        String[] superHeroes = {"Iron Man", "CapitanAmerica", "Spiderman", "Black Panther", "Hulk", "Black widow", "Wanda", "CapitanMarvel"};
        System.out.println("marvel heroes : " + Arrays.toString(superHeroes));
        int size = superHeroes.length;
        System.out.println("here count = " + size);
        String itemToSearch = "Iron Man";
        int count = 0;
        for (String eachHero : superHeroes) {
if(eachHero.equalsIgnoreCase(itemToSearch)){
count++;
        }
    }String black="black";
        System.out.println("Iron Man count "+count);
        int count1=0;
         for (String eachHero : superHeroes){

     if(eachHero.toLowerCase().contains("black")){
         count1++;


        }
        }          System.out.println(" find how may black in the string = " +count1);                                                           }}