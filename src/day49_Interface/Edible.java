package day49_Interface;

public interface Edible {
  //interface is like a contract once someone sign a contract he/she will provide all the details that he/she must do
 public static final boolean IS_HUMAN_FOOD=true;//IN INTERFACE ANY FIELD AUTOMATICKLY PUBLIC stastic FINAL
  public abstract void eat ()  ;//void drink();
  public abstract void drink();//void eat();
//if a method with no-body is not defined public abstract , it's autotaiccally public
//abstract //you can have as many as constant as you want
//public abstract void digest();it can fail
//or override it according to thir own requirements
    public default void digest(){
        System.out.println("you implement the code yourself");
}

}
