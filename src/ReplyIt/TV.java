package ReplyIt;

public class TV {
    int channel=1,  volumeLevel=1;
    boolean on=false;
    String brand= "undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }public TV(String brand){

        System.out.println("Creating TV object using 1 arg - constructor");
    }public  int getVolumeLevel(){
        return volumeLevel;
    }public  void setVolumeLevel(int volumeLevel){
        this. volumeLevel=volumeLevel;
    }public  int getChannel(){
        return channel;
    }public  void setChannel(int channel){
        this. channel=channel;
    }public  int getBrand(){
        return channel;
    }public  void setBrand(String  brand){
        this.brand=brand;

    }public void volumeUp() {
        if (on==true&&volumeLevel >=1 &&volumeLevel <=7){
            System.out.println(volumeLevel+1);
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } }public void volumeDown() {
        if (on==true&&volumeLevel >=1 &&volumeLevel <=7){
            System.out.println(volumeLevel-1);
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }}public void channelUp(){
        if(on==true&&channel>0&&channel<120){
            System.out.println(channel+1);
        } else{ System.out.println("ERROR: TV is either OFF or invalid Channel");
        }}public void channelDown(){
        if(on==true&&channel>0&&channel<120){
            System.out.println(channel-1);
        } else{ System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }public boolean isOn(){
        return on;
    }public void turnOn(){
        if(on==true){
            System.out.println("TV is already ON");
    }else {
            on =false;

        }  }public void turnOff(){
        if(on!=true){
            System.out.println("TV is already OFF");
    }else{ on=true;
    }
}

}
