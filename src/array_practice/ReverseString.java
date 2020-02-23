package array_practice;

public class ReverseString {
    public static void main(String[] args) {
        String str=   "The quick brown fox";
        String reverse="";
        char []ch=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
         reverse+=ch[i] ;
        }
        System.out.println(reverse);
    }
}
