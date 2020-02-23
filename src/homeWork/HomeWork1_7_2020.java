package homeWork;

import java.util.ArrayList;

public class HomeWork1_7_2020 {
    public static void main(String[] args) {
        //and if it has exactly 5 characters , reverse it
        //Of course , Otionally make a method out of it.

        ArrayList<String> names = new ArrayList<>();
        names.add("Ceylin");
        names.add("Aysegul");
        names.add("Abdurrahman");
        names.add("Ahmet");
        names.add("L");
        names.add("Ali");
        names.add("Nese");
        names.add("Su");

        System.out.println(ChangingNames(names));

        }public static ArrayList<String>ChangingNames(ArrayList<String> str){
        System.out.println(str.size()); //Given List of names with various character count,
        //Remove any name with less than 2 characters
        for(int i=0;i<str.size();i++){
            if(str.get(i).length()<2){
                str.remove(i);
                i--;//remove yapinca index numarasi degisir
                System.out.println(str);}
            //and if any name has more than 10 character only keep 10 characters
            else   if(str.get(i).length()>10){
                str.get(i).substring(0,10);
                System.out.println(str.get(i));
            }// //and if it has exactly 5 characters , reverse it
            else  if(str.get(i).length()==5){
                String namereverse="";
                for( int x=str.get(i).length()-1;x>=0;x--){
                    namereverse+=(str.get(i).charAt(x) );}
                str.set(i,namereverse);
                System.out.println(namereverse);

            }
        }


        return str;}
}
