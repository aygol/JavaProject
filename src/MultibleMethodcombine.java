public class MultibleMethodcombine {
    public static void main(String[] args) {

        String name="Arya Stark";
        String uppercaseName=name.toUpperCase();
        System.out.println(" uppercaseName contains ST or not?"+uppercaseName.contains("ST"));
        String lowercaseName=name.toLowerCase();
        System.out.println(" lowercaseName contains st or not?"+lowercaseName.contains("st"));
      //
        System.out.println( name.toLowerCase().contains("st"));
   //do not do it   System.out.println( name.length().toUpperCase());



    }
}
