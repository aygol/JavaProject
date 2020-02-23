package day45;

public class TV {

        private int channel=1;
        private   int volumeLevel=1;
        private  boolean on =false;
        private  String brand= "undefined";
        public TV(){
            System.out.println("Creating TV object using no Args- constructor");
        }
        public TV(String brand){
            this .brand=brand;
            System.out.println("Creating TV object using 1 arg - constructor");
        }public void setVolumeLevel(int volumeLevel) {
            if(on==true){
                if (volumeLevel >1 || volumeLevel < 7) {
                    this .volumeLevel=volumeLevel;}else{
                    System.out.println("ERROR: TV is either OFF or invalid Volume level");
                }}}
        public int getVolumeLevel () {
            return volumeLevel;
        }
        public void setChannel ( int channel){
            if (channel <= 0 || channel > 120) {
                System.out.println("ERROR: TV is either OFF or invalid Channel");
            } else {if(on==true){
                this.channel = channel;}

            }
        }
        public int getChannel () {
            return channel;
        }
        public void setBrand (String brand){
            this.brand = brand;
        }
        public String getBrand () {
            return brand;
        }
        public int volumeUp () {
            volumeLevel++;
            return volumeLevel;
        }
        public int volumeDown () {
            volumeLevel--;
            return volumeLevel;
        }
        public int channelUp(){
            if(on==true){
                return channel++;}
            return channel;
        }public int channelDown(){
            if (on==true){
                return channel--;
            }return channel;

        }public void turnOn(){
            if(on==false){
                System.out.println("TV is already ON");
                on=true;
            }}

        public void turnOff (){
            if (on ==true) {
                System.out.println("TV is already OFF");
                on=false;
            } }
        public String toString() {
            return "TV{" +
                    "channel=" + channel +
                    ", volumeLevel=" + volumeLevel +
                    ", on=" + on +
                    ", brand='" + brand + '\'' +
                    '}';}
    }
