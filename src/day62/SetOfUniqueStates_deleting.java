package day62;

import java.util.*;

public class SetOfUniqueStates_deleting {
    public static void main(String[] args) {
        Set<String>states=new HashSet<>();
        states.addAll(Arrays.asList("GA","NY","FL","CA","WA","VA","VA","FL","WA"));
 //states.remove("GA");
  //remove all the states with letter A
        //we use iterator for this we connot use eachloop
        Iterator<String>stIter=states.iterator();
        System.out.println("before states "+states);
        while(stIter.hasNext()){
            String each=stIter.next();//if do not save it it has problem
            if(each.contains("A")){
                System.out.println("Removing = "+each);
                stIter.remove();

   //iterator has 3 method works together
   //to remove item while iterating over collection
            }
        }
        System.out.println("After states "+states);

    }
}
