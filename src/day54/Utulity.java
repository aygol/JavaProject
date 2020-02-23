package day54;

public class Utulity {
    public static void main(String[] args) {
        Wearable  w1=new Clothes();
        wearMyWearable(w1);
        Wearable  w2=new Makeups();
        wearMyWearable(w2);
        Wearable  w3=new Watch();
        wearMyWearable(w3);
        Wearable  w4=new Perfume();
        wearMyWearable(w4);


    }public static void wearMyWearable(Wearable any){
        any.wear();
    }
}
