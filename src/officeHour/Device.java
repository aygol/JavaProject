package officeHour;

import homeWork.WaterBill;

public abstract class Device implements WaterProof {

    int size;
    int price;
    public void call(){
        System.out.println("Device is calling ");
    }
public abstract void sendMessage();


}
