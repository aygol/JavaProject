package day20;

public class ReverseName {
    public static void main(String[] args) {
        String name="Jon Snow";
        String reverseName="";
     for(int x=7;x>=0;x--) {
      //   System.out.println(x+" index");
      //   System.out.println(name.charAt(x));
reverseName = reverseName + name.charAt(x);

     }

        System.out.println(reverseName);


    }
}
