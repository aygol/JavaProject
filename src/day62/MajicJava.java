package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MajicJava {
    public static void main(String[] args) {

        //Interview question //how do i remove item while iteration over collection
        // ? => using iterator
        Set<String> states=new HashSet<>();
        states.addAll(Arrays.asList("GA","NY","FL","CA","WA","VA","VA","FL","WA"));
        //states.remove("GA");
        //if it contains A remove

       //LAMDA
        states.removeIf(each->each.contains("A"));
        System.out.println("states after = "+states);
    }
}
