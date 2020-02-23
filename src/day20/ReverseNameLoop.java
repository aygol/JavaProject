package day20;

public class ReverseNameLoop {
    public static void main(String[] args) {
        String name="Abdurrahman Golcu";
        String reverseName="";
        int lastCharIndex=name.length()-1;
        for(int x=lastCharIndex;x>=0;x--) {
            //   System.out.println(x+" index");
            //   System.out.println(name.charAt(x));
            reverseName = reverseName + name.charAt(x);

        }

        System.out.println(reverseName);


    }
}
