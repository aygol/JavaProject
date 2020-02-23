package day09;

public class SwitchLanguage {
    public static void main(String[] args) {
        int language = 2;

        String greeting = " ";
switch (language) {
    case 1:
        greeting = "Hello";
        break;
    case 2:
        greeting = "Salam";
        break;
    case 3:
        greeting = "Hola";
        break;
    case 4:
        greeting = "Privet";
        break;
    case 5:
        greeting = "Merhaba";
        break;
    case 6:
        greeting = "Szia";
        break;
    case 7:
        greeting = "Bonjour";
        break;
    default:
        System.out.println("I do not know that language!!");
}
        System.out.println( greeting=greeting+" , SDET");

    }
}
