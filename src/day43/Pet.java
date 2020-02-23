package day43;

public class Pet {
 private   String type;
  private  String name;

    //no arg constractor
    //set the breed to "unknown"
    //set the name to "unknown"
//set the breed to "noname"
    public Pet(){
        this.type="unknown";
        this.name="Noname";
    }
    public Pet(String type,String name){
        this.type=type;
        this.name=name;}

    public String toString() {
        return "Animal{" +
                "breed='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }   public void speak() {

        //switch (type.toLowerCase()  ){
        switch (type) {

            case "cat":
                System.out.println("MEOW");
                break;
            case "dog":
                System.out.println("WOOF");
                break;
            case "horse":
                System.out.println("NEIGH");
                break;
            case "cow":
                System.out.println("MOOO");
                break;
            default:
                System.out.println("UNKNOWN ANIMAL!");

        }
    }

        public String getType() {
        return type;

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }public static void showGeneralPetInfo(){
        System.out.println("Pets are friends of humans");
 //       System.out.println(name);STSTIC METHOD DOES NOT ACCEPT NON-STATIC
    }
}
