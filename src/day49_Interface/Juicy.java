package day49_Interface;

public interface Juicy {

    public abstract void melt();
    public static void squeeze(){
        System.out.println("Static squeezing");

    }

    public static void main(String[] args) {
        Juicy.squeeze();
    }
}
