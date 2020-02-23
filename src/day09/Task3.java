package day09;

public class Task3 {
    public static void main(String[] args) {
        /*Language Picker:

        1------->>"Hello"
        2-------->>"Salam"
        3------->>"Hola"
        4-------->>"Merhaba"
        5------->>"Szia"
        6-------->>"bonjour"*/
        // The program should set the value of a String variable called greeting To this value:
        int language = 2;

        String greeting = " ";

           if (language ==1) {
greeting="Hello";
        }
        else if (language ==2) {
            greeting = "Salam";
        }else if (language==3) {
            greeting = "Hola";
        }else if (language ==4) {
            greeting = "Privet";
        } else if (language ==5) {
                greeting = "Merhaba";
            }else if (language==6) {
                greeting ="Szia";
            }else if (language ==7) {
            greeting = "Bonjour";
            }else{
             System.out.println("I do not know that language!!");
         }
        System.out.println( greeting=greeting+" , SDET");








    }
}
