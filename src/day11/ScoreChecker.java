package day11;

import jdk.swing.interop.SwingInterOpUtils;

public class ScoreChecker {
    public static void main(String[] args) {

        int score = 90;
        if(score<20){
            System.out.println("COME TO MY OFFICE");

        } else if (score < 0 || score > 100){
            System.out.println("INVALID SCORE");
        } else if (score == 100) {
            System.out.println("PERFECT SCORE");

        } else if (score > 70 && score < 100) {
        System.out.println("YOU HAVE PASSED!");
    } else{


            System.out.println("YOU HAVE FAILED!!!");


        }
    }}
