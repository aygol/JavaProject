package day52.polimorphism;

public abstract class Book implements KnowledBank {

    	String name;
    	String author;
    //-- add constructors to set the fields
    //-- abstract void method

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayBookInfo();

    @Override
    public void takeNote() {

    }

    @Override
    public void showTableOfContent() {

    }
}
