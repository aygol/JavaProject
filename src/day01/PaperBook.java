package day01;

public class PaperBook extends Book {
    int pageCount;
  public  int weigth;
  public boolean hardcover;



    public static void main(String[] args) {
        PaperBook b1=new PaperBook();
        b1.pageCount=300;
        b1.chapterCount=7;
        b1.price=10.77;
        b1.author="Suzanne Collins";
        b1.hardcover=true;
        AudioBook a1=new AudioBook();
        a1.author="Peyami Safa";
        a1.chapterCount=6;
        a1.price=12.99;
a1.printauthor();
a1.play();

    }
}
