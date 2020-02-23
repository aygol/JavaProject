package day24;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {

        System.out.println("---------- character sorting ------------");
        // the low to high order for character is decided by it's ascii table value
        // special characters comes first , number , uppercase then lowercase
        char[] nameChars = {'G', ' ', 'd', 'Z', '9', 'A'};
        System.out.println("before sorting nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars = " + Arrays.toString(nameChars));
        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash", "100", "9", "09"};
        System.out.println("before sorting superHeros = " + Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting superHeros = " + Arrays.toString(superHeros));

        System.out.println("---------- boolean sorting -----SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY-------");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));
        //Arrays.sort(fiveSwitchOnOffs); DOES NOT WORK FOR BOOLEAN ARRAY !!

        // Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action to reshuffle the index of original array object to keep it in sorted order










    }
}
