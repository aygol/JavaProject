package day52.polimorphism;

public interface KnowledBank {
    public abstract void takeNote();
    public default void showTableOfContent(){
        System.out.println(" Table of content ");
    }

}
