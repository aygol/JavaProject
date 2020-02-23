package day41;

public class Teacher {
   private String name;
   private int age;

    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("Swetlena");
        t1.setAge(23);
    }public String getName(){
        return name;
    }public void setName(String name){
        this .name=name;

    }public int getAge(){
      return age;
    }public void setAge(int age){
    this .age=age;
}public void initilizeFields(String name, int age){
        this.name=name;
        this .age=age;
    }





}
