package day51_Polimorphism;

public class Person implements Comparable<Person> {
    String name;
    int age;

    // //compare p1 to p2 by age if p1 is older print 1 if they are same age print 0
//        //if p2 is older print -1
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*  public int compareTo(Person otherPerson){
          if (this.age>otherPerson.age){
          return 1;
      }else   if (this.age<otherPerson.age){
              return -1;
  }  else  {
              return 0; }
      } */
    public int compareTo(Person otherPerson) {
   /*     if (this.name.charAt(0)>otherPerson.name.charAt(0)){
            return 1;
        }else   if (this.name.charAt(0)<otherPerson.name.charAt(0)){
            return -1;
        }  else  {
            return 0; }*/
        return this.name.compareTo(otherPerson.name);

    }
}