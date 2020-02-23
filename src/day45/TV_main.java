package day45;

import com.sun.security.jgss.GSSUtil;

public class TV_main {
    public static void main(String[] args) {
        TV t1=new TV();
      t1.setBrand("Saba");
     // t1.channel=7;
         t1.setVolumeLevel(5);

        System.out.println(t1.getChannel()); //  t1.getChannel();
        System.out.println(t1.getVolumeLevel());// t1.getVolumeLevel();
t1.volumeDown();
        System.out.println(t1.volumeDown());
t1.volumeUp();
        System.out.println( t1.volumeUp());


    }

}
