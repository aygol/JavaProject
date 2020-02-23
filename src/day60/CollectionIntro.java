package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionIntro {

    public static void main(String[] args) {
    //List<String> names=new ArrayList<>();
    Collection<String> names=new ArrayList<>();

 /*the word collection every where
 Collection Faremework taking about entire things entire topic
 Collection Interface one interface under the entire Collection Framework
* The word Collection everywhere :
*
*
* Collection Framework -->> referring entire things , entire topic
*
* Collection Interface --->> one interface under the entire Collection Framework
*
* Collections class  -->> (it has s at the end, just like Array and Arrays )
*                   -->>  is a utility class with many static methods
*                 for example : Collections.sort(your collection object1)
*
*
* */
names.add("Hasan");
names.add("Ceylin");
names.add("Abdullo");
names.add("Tuana");
names.add("Daria");
names.add("Lorin");
names.addAll(names);//names method parameter type is Collection (Interface)so we can Pass anything IS_A collection
        //names.remove("Hasan");
        //removeAll can be used to remove many at the same time
        //removeAll expect another Collection object
        Collection<String >toRemoveLst=Arrays.asList("Abdullo");
        names.removeAll(toRemoveLst);
        names.removeAll(Arrays.asList("Hasan"));
        System.out.println("names = "+names);
        for(String eachname: names){
            System.out.println("names = "+names);

        }
      //System.out.println("first item "+names.get(0)); it did not compile







    }
}
