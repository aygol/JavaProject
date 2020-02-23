package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//import.util.*;importing everything java.util for convenience
public class Task {
    public static void main(String[] args) {
        //Create a set of String called states
        //add bunch of states with some dublicate
        //iterate over them using each and every way you know
        Set<String> states=new HashSet<>(Arrays.asList("FL","California", "New Jersey", "California","FL"));
        states.forEach(each-> System.out.println("Each states= "+each+" "));
        System.out.println("states "+states);
 //Addall method type has addAll method
        Set<String> states1=new HashSet<>();
 states1.addAll(Arrays.asList("GA","NY","FL","CA","WA","VA","VA","FL"));
 for(String each:states1){
     System.out.println("each= "+each);
  // WE CAN  NOT SORT IT AND WE CANNOT USE FOR LOOP BECAUSE WE DO NOT HAVE INDEX
 }//Iterator <String>stIter=states1.iterator();
 //while(stIter.hasNext()){
//     System.out.println("stIter = "+stIter.next());
 }
    }

