package OOProgram_InJava;

public class Family {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.age=39;
        p1.name="Ayse";
        p1.SSN=123456;
        p1.cooking("rice");
        Parent p2=new Parent("Abdurrahman",46,1234556);
        Child c1=new Child();
        c1.age=23;
        c1.lastName="Celik";
        c1.name="Merve";
        c1.cooking("pasta");
        c1.SSN=1245678;



    }


}
