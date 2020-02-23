package day52.polimorphism;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookTest {
    public static void main(String[] args) {
        Book b1 = new PaperBook("Java", "Akbar", 3);
        Book b2 = new PaperBook("Selenium", "Vasyl", 2);
        Book b3 = new AudioBook("Agile", "Guljannat", 1.8);
        Book b4=  new PaperBook("Lean in","Sherly Sandberg",4);
        Book b5=  new PaperBook("A Brief History of Time","Stephen Hawking",7);
        Book b6=  new PaperBook("The Power of Habit ","Charles Duhingg",5);
b1.displayBookInfo();
KnowledBank kb=b1;
kb.takeNote();
kb.showTableOfContent();
List<Book> bookList= Arrays.asList(b1,b2,b3,b4,b5,b6);
int pcount=0;
int acount=0;
for(Book each:bookList){
    String className=each.getClass().getSimpleName();
    System.out.println(className);
    if(className.equals("PaperBook")){
        pcount++;

    }else if(className.equals("AudioBook")) {
        acount++;
    }
 //   each.displayBookInfo();
}//we want to get the class name using the object
        //obj.getClass().getSimpleName()
        System.out.println("There are "+pcount+" PaperBook "+acount+" AudioBook");
    }}
