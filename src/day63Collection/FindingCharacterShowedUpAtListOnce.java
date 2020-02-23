package day63Collection;

import java.util.*;
import java.util.Set;

public class FindingCharacterShowedUpAtListOnce {
    public static void main(String[] args) {

            String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                    ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                    "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                    "Click to join";

           // Set<Character> chars =new HashSet<>(Arrays.asList(new char[]{'A','A','A','A','A'}));
        //instedaed of going every characer  i want to going each word
            //for(int x=0;x<str.length();x++){
            //    charSet.add(str.charAt(x));}
        String []eachCharStrArray=str.split("");
        System.out.println("Arrays.toString(eachCharStrArray)= "+Arrays.toString(eachCharStrArray));
        List<String>charLst=Arrays.asList(eachCharStrArray);
        Set<String>charSet=new HashSet<>(charLst);
        System.out.println("charSet = "+charSet);
        }
    }

