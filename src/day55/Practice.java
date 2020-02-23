package day55;

public class Practice {

    public Practice() {
        this(100);
        System.out.println("no argument constractor");
    }

    public Practice(int x) {
          //super();
        //    this(); if this actife also it makes infinite loop because it is calling itself again so it did not compile
        System.out.println("1 arg constructor");
    }

    public static void main(String[] args) {
      //25--->7-9-15-18-7-10---28
        Practice t=new Practice();
    }
}
