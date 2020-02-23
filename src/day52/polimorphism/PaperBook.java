package day52.polimorphism;

public class PaperBook extends Book implements KnowledBank,Readable {
      int weight;

       public PaperBook(String name, String author, int weight) {
           super(name,author);
            this.weight = weight;
        }

       public void displayBookInfo() {
           toString();
           System.out.println(name+" Book is written "+author);

       }
       public void read(){
           System.out.println("Reading the "+name+" written by "+author);
     }



    @Override


    public void takeNote() {
        System.out.println("Taking the notes from "+name);
    }
    @Override
    public void showTableOfContent() {
        System.out.println("Show tabel of the content");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
