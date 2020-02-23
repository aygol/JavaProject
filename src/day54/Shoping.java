package day54;

public class Shoping {
    public static void main(String[] args) {
      // try out all the polymorphic assignment
        // according to these relationship	        // according to these relationship
        Clothes c1 = new Clothes();
        c1.wear();
        Wearable c2 = new Clothes();
        c2.wear();
        Object c3 = new Clothes();

        //-------------------------
        Watch w1 = new Watch();
        Wearable w2 = new Watch();
        Object w3 = new Watch();
        // -------------------------
        Perfume p1 = new Perfume();
        p1.wear();
        Wearable p2 = new Perfume();
        Cosmetics p3 = new Perfume();
        Object p4 = new Perfume();

        Makeups m1 = new Makeups();
        Wearable m2 = new Makeups();
        Cosmetics m3 = new Makeups();
        Object m4 = new Makeups();


    }
}
