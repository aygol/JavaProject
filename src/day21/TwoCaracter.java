package day21;

public class TwoCaracter {
    public static void main(String[] args) {
        String myName="Ceylin Golcu";//location of name Upper case
        int charCount= myName.length() ;//find out how many a case insensetive action manner
        //find we will cheack every letter of the string---for loop
        //while i am going to check whether current character i am looking at
        //  equals to aA -->current Charecter.equalsIgnoreCase("a")if it is I will print the index if not just move on
        //perform this action until I reach last charecter
        int lastCharIndex=charCount-1;
        for(int x=0; x<=lastCharIndex-1;x++){
            String currentChar= myName.substring(x,x+2);
            if(currentChar.equalsIgnoreCase("li")){
                System.out.println("The index of LI or li "+x);//index is 3
    }
}}}
