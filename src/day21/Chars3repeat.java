package day21;

public class Chars3repeat {
    public static void main(String[] args) {
        String myName="Behlia Amelia Melia ";//location of name Upper case
        int charCount= myName.length() ;//find out how many a case insensetive action manner
       int counter=0;
        System.out.println("----------3 character------");
        int lastCharIndex=charCount-1;
        for(int x=0; x<=lastCharIndex-2;x++){
            String currentChar= myName.substring(x,x+3);
            if(currentChar.equalsIgnoreCase("lia")){
                System.out.println("The index of LIA or lia "+x);//index is 3
                counter++;
            }
    }
        System.out.println(counter);}}
