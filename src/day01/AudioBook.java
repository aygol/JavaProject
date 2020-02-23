package day01;

public class AudioBook extends Book {
    private int audioLength;
    public void play(){
        System.out.println("We are playing "+ author+" s book "+ audioLength+ " hour long ");
    }
}
