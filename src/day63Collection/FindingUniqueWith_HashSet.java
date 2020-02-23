package day63Collection;

import java.util.HashSet;
import java.util.Set;

public class FindingUniqueWith_HashSet {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

//how many uniqie character showed up in above sentence
        //one way to do it
        //first find a data structure that automatically remove duplicate (create a HashSet object with type Character )
        //iterate over each character in above String
        //then add it to the object (>HashSet ) so it can remove the duplicate for us
        Set<Character> charSet=new HashSet<>();
        for(int x=0;x<str.length();x++){
            charSet.add(str.charAt(x));}
        System.out.println("how many character "+str.length());
        System.out.println("how many unique character "+charSet.size());
        System.out.println("CharSet= "+charSet);

        for(Character eachChar:charSet){
            System.out.println("each Unique char = "+eachChar);
        }


    }
}


