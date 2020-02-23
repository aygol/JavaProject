package array_practice;

public class Spaceadding {
    public static void main(String[] args) {
        //Write a method that takes a String as a parameter where all words are written together
        //with no spaces and this method should add spaces between words and print it out.
        //Each new word begins with a capital letter.
        //
        //Ex: input String: "HelloFriends!It'sNiceOutThereToday!" --> output: "Hello Friends! It's Nice Out There Today!
        //
        //Please do not use any class/method we did not learn in class yet!
        addSpaceMethod("HelloFriends!It'sNiceOutThereToday!");
    }public static void addSpaceMethod(String str){
        String spaceStr="";
        for(int i=0; i<str.length();i++){
            if(!Character.isUpperCase(str.charAt(i))&&i!=0){
              spaceStr+=str.charAt(i);
            }if(Character.isUpperCase(str.charAt(i))){
                spaceStr+=" "+str.charAt(i);
        }
    }
        System.out.println(spaceStr);
}}
