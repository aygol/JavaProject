package day23;


import java.util.Arrays;

public class ArrayMethotSorting {
    public static void main(String[] args) {
    int [] scores={99,44,66,23,19,55} ;
        System.out.println(Arrays.toString(scores));
  Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("-----character sorting-------");
  System.out.println("new first item value :"+scores[0]) ;
  char[] nameChars ={'G','A','D','Z','C','A'};
        System.out.println("before sording nameChars "+ Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("After sorting nameChars "+ Arrays.toString(nameChars));
        System.out.println("-----String sorting-------");
        String []superHeros={"Superman", "Batman", "Wonder"," women","Aquamen","Cyborg" ,"Flash"+"100","9"};
        System.out.println("before sorting "+Arrays.toString(superHeros));
    Arrays.sort(superHeros);
        System.out.println("after sorting "+Arrays.toString(superHeros));
        System.out.println("-----boolean sorting-------");//we do not have
        boolean [] FiveSwitchOnOffs= {true, false,false,true,true};
        System.out.println("FiveSwitchOnOffs "+FiveSwitchOnOffs);

    }
}
