package day17;

public class NameNormalizer {
    public static void main(String[] args) {

        //make your name any combination and make first letter uppercase then rest of them lowercase
        String name="abDuRRahman";
      //  String nameFixed=(name.charAt(0)+"").toUpperCase();
      //  nameFixed=name.substring(1).toLowerCase();
       String nameFixed=name.toUpperCase().substring(0,1);
        nameFixed+=name.substring(1).toLowerCase();
        System.out.println("name fixed "+nameFixed);



    }
}
