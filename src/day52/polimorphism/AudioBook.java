package day52.polimorphism;

public class AudioBook extends Book{
    double duration;

    public AudioBook(String name, String author,double duration) {
        super(name, author);
    }

    @Override
    public void takeNote() {
        System.out.println("takes notes on the digital book by "+name+ " "+author+"written the provided digital tabel");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("If you want to see table of the content click thie button");

    }

    @Override
    public void displayBookInfo() {

    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static  void listen(){
        System.out.println("Listening  the book");



    }
}
