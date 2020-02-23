package day32;

public class StringAction {
    public static void main(String[] args) {
//reverse your name
//print each every character of a string with dah in betweeen excluding thr last one Ayse--->A-y-s-e
        reverseName();
        printStringWithDashInBetween("Ceylin");
        printStringWithDashInBetween("Seyma");
        printStringWithDashInBetween("Ali");
        printStringWithDashInBetween("Ahmet");
        printStringWithDashInBetween("Furkan");
    }public static void reverseName(){
        String name="Ayse";
     for(int i=name.length()-1;i>=0;i--)  {
         System.out.print(name.charAt(i));
         if(i!=0){
             System.out.print("-");
         }
     }
        System.out.println();


    }public static void printStringWithDashInBetween(String name1){
     for(int i=0; i<name1.length();i++) {
         System.out.print(name1.charAt(i));
         if(i!=name1.length()-1){
             System.out.print("-");
         }
     }
        System.out.println();

    }




}
