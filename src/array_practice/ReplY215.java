package array_practice;

public class ReplY215 {
    public static void main(String[] args) {
      String deney=  reverseWords("18ds$%j&&(kkk)");
        System.out.println(deney);

    } public static String reverseWords (String word){
        String reverseword="";
        String notreverseCharacter="";
        int k=0;
        for(int i=word.length()-1;i>=0;i--,k++) {
            if (Character.isLetter(word.charAt(i))) {//if character is letter reverse it.
                reverseword +=""+word.charAt(i) ;

            }else{reverseword += ""+word.charAt(k) ;
        }}return reverseword;

       /* }for(int i=0;i<word.length();i++){
            if(Character.isLetter(word.charAt(i)) ){
                notreverseCharacter += reverseword.charAt(i)+"";
            }else {
                notreverseCharacter +=word.charAt(i)+"";

            }}return notreverseCharacter;*/
    }
}


