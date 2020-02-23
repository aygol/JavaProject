package array_practice;

import java.util.Arrays;

public class Strin_array {
    public static void main(String[] args) {
        String [ ] shows={"orwille","Gifted","Game of Throne","Flash","Arraw","Super girl"};
        int showsCount=shows.length;
        System.out.println("shows count= "+showsCount);
        for(int x=0; x< showsCount;x++) {
            System.out.println(shows[x]+" has character count "+shows[x].length());

//Array class has pre built package with array
            //to string the content of array  toString  Array.toString(yourArrayjere}
String[] superHeros={"Superman","Batman","wonder women","Aquaman","Cyborg","Flash"};
            System.out.println(Arrays.toString(superHeros));
String superHerosAsString=Arrays.toString(superHeros);
            System.out.println("first charecter of superHerosAsString "+superHerosAsString.charAt(0));


        }

    }
}
