package day20;

public class PalindromeTest {
    public static void main(String[] args) {
  //if you reserve a string it does not change it means the string palindrome
  //level kayak elle madam, aziza
  String name="kayak"  ;
  String reversedName="";
  for(int x=name.length()-1;x>=0;x--) {
      reversedName = reversedName + name.charAt(x);
  }
        System.out.println("reversed name "+reversedName);
  if(name.equalsIgnoreCase(reversedName)) {
      System.out.println("Polindrome test passed");
  }else{
      System.out.println("Polindrome test failed");
  }





    }
}
