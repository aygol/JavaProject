package day06;

public class CompoundOrder {
    public static void main(String[] args) {
        /*int studentOnline=263;
        studentOnline +=5;
        System.out.println("5 people joined the class "+studentOnline);
         studentOnline -= 3;                             //studentOnline=studentOnline-3;
        System.out.println("3 people left the class "+studentOnline);
         studentOnline *=2;                    //studentOnline=studentOnline+studentOnline;//studentOnline*2 de olabilir
        System.out.println("the student doubled "+studentOnline);

        studentOnline /=3;                              //studentOnline=studentOnline/3;
        System.out.println("the student droped 1/3 : "+studentOnline);*/
        int offerCount=2;//initilizing (giving value) offerCount to 2
        offerCount +=1;//this is incrsing by compound operator and we us ++or--this is incrasing or decrasingby1
       ++offerCount;
        System.out.println("offer Now after increasing by one "+ offerCount);
        --offerCount;
        System.out.println("offer Now after decrasing by one "+ offerCount);

        int bankBalance = 1140;
        System.out.println("I have spent the half of it : " + bankBalance);
        //bankBalance = bankBalance /2 ;
        bankBalance /= 2;
        System.out.println("Now my balance is " + bankBalance);
        // I want to divide the balance by 500 and keep the remainder in my pocket
        //bankBalance = bankBalance % 500 ;
        bankBalance %= 500;  // 570 divided by 500 , remainder is 70 ;
        System.out.println(" I want to divide the balance by 500 and keep the remainder in my pocket");
        System.out.println("the remainder is : " + bankBalance);


    }
}
