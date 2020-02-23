package day34;

public class ReturnPractice {
    public static void main(String[] args) {
        printMin4CharacterLengthName("jon");
        printMin4CharacterLengthName("Java");
        printMin4CharacterLengthName("nese");
        printMin4CharacterLengthName("Ali");
        //what is return keyword used
        //break vs return
        //break---> loop : break out of the loop
        //switch : break out of the case
        //can we use it to exit method ?? NO!!!!
        //return --> inside a method
        //return the value out of a method with return type
    }public static void printMin4CharacterLengthName(String name){
        if(name.length()<4){
            System.out.println("INVALID NAME!!");
            return ;
        } System.out.println(name);
    }
}
