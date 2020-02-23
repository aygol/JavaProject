package day16;

public class ILOVEJava {
    public static void main(String[] args) {
String sentence="I love java I love java java java";
        System.out.println("Starting from 0"+sentence.indexOf("java"));
        System.out.println("Starting from 7"+sentence.indexOf("java",7));
        System.out.println("Starting from 8"+sentence.indexOf("java",8));
        System.out.println("Starting from 9"+sentence.indexOf("java",9));
        System.out.println("Starting from 19"+sentence.indexOf("java",19));
        System.out.println("Starting from 20"+sentence.indexOf("java",20));
int firstLocation=sentence.indexOf("java");//7
        int startingPointTosecondLocation=firstLocation+1;
//String name = "I Love Java i Love Java Java Java";
//2
//        System.out.println(name.indexOf("Java"));
//3
//        System.out.println(name.indexOf("Java",name.indexOf("Java")+1));

    }
}
