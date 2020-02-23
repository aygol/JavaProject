package day43;

public class PetStaticPractice {
    public static void main(String[] args) {
        Pet.showGeneralPetInfo();
       // Pet.getName() IT DOES NOT WORK IT NEEDS OBJECT
        Pet p1=new Pet("cat","yumyum");
        System.out.println("p1 name= "+p1.getName());
        p1.speak();
    }
}
