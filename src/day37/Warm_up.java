package day37;

import java.util.ArrayList;

public class Warm_up {
    public static void main(String[] args) {
        //Warm up:
        //Create Arraylist of String and store
        //teamMates
        //print one by one
        //print reverse
        //print first last

        //concat everyone in one string separated by -
        ArrayList<String> teamMates = new ArrayList<>();
        String[] teamMates1 = {"Furkan Tan", "Ahmet Baltaci", "Alisa Zakirowa", "Ayse Golcu", "Daria Ozer", "Fatih Demir", "Fatma Ulusal", "Guvanch Kurbanov", "Muge Orman", "Serife Kilic"};
        for (int i = 0; i < teamMates1.length; i++) {
            teamMates.add(teamMates1[i]);
        }
        System.out.println(teamMates);
        for (int i = 0; i < teamMates.size(); i++) {
            System.out.println("Team members " + (i + 1) + " = " + teamMates.get(i));
        }
        String reverse = "";
        //   for (int i = 0; i < teamMates.size(); i++){
        //    for (int j = teamMates.get(i).length(); j <= 0; j--) {
        //       reverse+= teamMates.get(i).charAt(j);
        //      System.out.println(reverse);}}
        for (int i = teamMates.size()-1; i >= 0; i--) {
            System.out.println("Team members Reverse order" + (i + 1) + " = " + teamMates.get(i));


        } //print 2 at a time
        System.out.println(teamMates);
        for (int i = 0; i <= teamMates.size()-2; i++) {
            System.out.println("Team members 2 of them same time "  + " = " + teamMates.get(i)+"****"+teamMates.get(i+1));

    } System.out.println(teamMates);
        for (int i = 0; i <= teamMates.size()-2; i+=2) {
            System.out.println("Team members 2 of them same time not repeat "  + " = " + teamMates.get(i)+"+++"+teamMates.get(i+1));
    }  int count=0;
        for (int i = teamMates.size()-1; i >= 0; i--) {
          count++;

            System.out.println("**Team members Reverse order" + (count ) + " = " + teamMates.get(i));
    }for (int i = 0; i <= teamMates.size()-3; i+=3) {
            System.out.println("Team members 3 of them same time not repeat "  + " = " + teamMates.get(i)+"+++"+teamMates.get(i+1)+"++"+teamMates.get(i+2));
        }String result="";
        for (int i = 0; i < teamMates.size(); i++) {
            result+=teamMates.get(i)+"-";

    }
        System.out.println("result= "+result);}}
