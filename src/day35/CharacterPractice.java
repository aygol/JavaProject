package day35;

public class CharacterPractice {
    public static void main(String[] args) {
   //Character class has  lots of static methods
 //to perform actions on char values
 //isDigits, isLetter, isLtterOrDigits, isUpperCase,isLowerCase
        System.out.println("Character.isDigit");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('6'));

  // Character class has lots of static methods
        // to perform actions on char values
        // isDigit , isLetter , isLetterOrDigit , isUpperCase  , isLowerCase
        // toUpperCase , toLowerCase
        System.out.println("IS DIGIT METHOD PRACTICE ");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        // Get the number out of this String
        // and store it into Integer variable num ;
        String numsInStr = "";
        for (int x = 0; x < str.length(); x++) {
            //isDigit accept char  // each char
            if (Character.isDigit(str.charAt(x))) {
                System.out.println("str.charAt(" + x + ") = " + str.charAt(x));
                // appeding number character to the result numsInStr
                numsInStr += str.charAt(x);
            }

        }
        System.out.println("numsInStr = " + numsInStr);
        // The requirement says get the result as Integer object
        Integer num = Integer.valueOf(numsInStr);
        System.out.println("num = " + num);

        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method
//  String str = "A34B123C4X";
   char myChar ='7' ;
   int sum=0;
   int myNum=Integer.parseInt(myChar+"");
       // System.out.println("  int myNum=Integer.parseInt(myChar+emptyString)= "+ myNum);
        char[]allChars=str.toCharArray();
        for(char each: allChars){
            System.out.println("each = "+ each);
        int eachNum=Integer.parseInt(each+"");
        sum=sum+eachNum;
        }
        System.out.println("sum= "+sum);
        System.out.println("*****************************************************");
    String str1= "A34B123C4X";
    int num1=0;
for(int i=0;i<str1.length();i++){
        if(Character.isDigit(str1.charAt(i))){
            num1+=Integer.valueOf(str1.charAt(i)+"");
        }
    }
System.out.println(num1);

}}
