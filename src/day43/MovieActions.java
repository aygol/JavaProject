package day43;
import day42.Movie;
import org.w3c.dom.ls.LSOutput;

public class MovieActions {
    public static void main(String[] args) {

        Movie m1 = new Movie("Joker", 2.5, "Drama");

        printMovieInformation(m1);
    }

    public static void printMovieInformation(Movie movieObj) {
        System.out.println(movieObj.getName());
        System.out.println(movieObj.getLength());
        System.out.println(movieObj.getClass());

    }public static void printShorterMovieInformation(Movie movieObj1,Movie movieObj2,Movie movieObj3) {
        if( movieObj1.getLength()> movieObj2.getLength()){
            Integer i1=Integer.valueOf(12);

        }}public static Movie getJokerObject(){
       Movie j=new Movie("Joker",2.5,"Drama");
        return j;
    }

    }
