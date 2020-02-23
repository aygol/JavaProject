package day34;

public class Math_Action_FromJDK {
    public static void main(String[] args) {
 String str="Hello";
        System.out.println(Math.addExact(7,90)) ;
int sum=Math.addExact(227,90);
System.out.println("sum = "+sum);
int max=Math.max(10,20);
        System.out.println("max 0f 10, 20 = "+max);
        //2, login2 :  static method boolean return type
        //	it has two String method paramters
        //			called username and password
        //	(it accept 2 String object as argument when being called)
        //	it check whther username and password  "user" and "abc123"
        //	if yes
        //		return true
        //	else
        //		return false
     login("ayse","abc123");
        System.out.println(login2("ayse", "abc123"));
    }public static  void login (String username,String password  ){
    username="Ayse";
    password="abc123";

     if (username.equalsIgnoreCase("Ayse")&&password.equals("abc123")) {
         System.out.println("Log in successful");

     }else{System.out.println("Log in failed");}


     }public static boolean login2(String username, String password){
        if (username.equalsIgnoreCase("Ayse")&&password.equals("abc123")){
            return true;
        }else{
            return false;
        }
         }
     }


