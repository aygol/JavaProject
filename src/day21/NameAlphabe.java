package day21;

public class NameAlphabe {
    public static void main(String[] args) {
        String myName="NeseSeyma";

        for(int i=0; i<=myName.length(); i++) {
            if (myName.substring(i,i+1).equalsIgnoreCase("y")) {
                System.out.println("Found It!!");
                break;}
              //  System.out.println(currentChar);
                System.out.println(myName.substring(i,i+1));

            }
        }
    }

