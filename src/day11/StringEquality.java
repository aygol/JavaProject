package day11;

public class StringEquality {
    public static void main(String[] args) {

        String name="Rabia";//String literal
        String name2=new String("Rabia");
        String name3="Rabia";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("USING == METHODS");
        System.out.println(name==name2);
        System.out.println(name==name3);//the correct way of comaring String to get consistent result is using object behavier'method called equals method
        System.out.println("USING EQUALS METHODS");
        System.out.println(name.equals(name2));

        System.out.println(name.equals(name3));


    }



}
