package day17;

public class FullNameCorecter {
    public static void main(String[] args) {
        String fullName="aBdurRahMan golCU";
        String firstName=fullName.substring(0,11);
        String lastName=fullName.substring(12);
        String firstNameCorected=firstName.toUpperCase().substring(0,1)+""+firstName.toLowerCase().substring(1);
        System.out.println(firstNameCorected);
   String  lastNameCorected=lastName.toUpperCase().substring(0,1)+""+lastName.toLowerCase().substring(1);

        System.out.println(firstNameCorected+" "+lastNameCorected);


    }
}
