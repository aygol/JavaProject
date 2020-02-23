package ReplyIt;

import java.util.Arrays;

public class ZombiCalisma {
    public static void main(String[] args) {
        int[]extinct={ 0, 0, 0, 0, 0, 0, 0, 0};
        int [] inhabitants={3, 6, 0, 4, 3, 2, 7, 0};
        int day=0;
        do{

            System.out.println("Day "+day+" "+ Arrays.toString(inhabitants));
            for(int i=0; i<inhabitants.length-1; i++){
                if(inhabitants[i]==0) {
                    inhabitants[i + 1] = inhabitants[i + 1] / 2;

                } if (inhabitants[i+1]==0) {
                        inhabitants[i]=inhabitants[i]/2;

                }day++;}}
        while(inhabitants!=extinct);
        System.out.println("Day "+day+" "+ Arrays.toString(inhabitants));
        System.out.println("----------extinct------------");



    }
}


