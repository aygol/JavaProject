package day34;

public class TwoMokey_Smiling {
    public static void main(String[] args) {
        //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
        //For example :
        //monkeyTrouble(true, true) → true
        //monkeyTrouble(false, false) → true
        //monkeyTrouble(true, false) → false
        //public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //    //TODO : Your code goes here
        System.out.println(monkeyTrouble( true, true));
        System.out.println(monkeyTrouble( true, false));
        System.out.println(monkeyTrouble( false, false));
        System.out.println(monkeyTrouble2( true, true));
        System.out.println(monkeyTrouble2( true, false));
        System.out.println(monkeyTrouble2( false, false));
    }public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return    (aSmile && bSmile)||(!aSmile&&!bSmile);//u can do return asmile==bsmile;
    }public static String monkeyTrouble2(boolean aSmile, boolean bSmile){
        if((aSmile && bSmile)||(!aSmile&&!bSmile)){
            return "yes";
        }else{
            return "No";
        }
    }



    }

