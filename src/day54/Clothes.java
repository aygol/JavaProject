package day54;

public class Clothes implements Wearable {
    public static void main(String[] args) {
        Clothes c1=new Clothes();
        Wearable w1=new Clothes();
        Object o1=new Watch();
        Perfume p1=new Perfume();

    }
    public void wear() {
        System.out.println("Wearing Clothes!!");
    }
}


class Watch implements Wearable {


    @Override
    public void wear() {
        System.out.println("Wearing Watches!!");
    }
}


class Perfume implements Wearable, Cosmetics {


    @Override
    public void wear() {
        System.out.println("Wearing Perfumes!!");
    }
}


class Makeups implements Wearable, Cosmetics {


    @Override
    public void wear() {
        System.out.println("Wearing Makeups!!");
    }
}





