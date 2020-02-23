package day23;

public class String_Array {
    public static void main(String[] args) {
        String [] names={"AYSE", "Ahmet","Seyma","Ceylin","Furkan", "Ali","Abdurrahman"};
        int namesCount=names.length;
        System.out.println("Names Count "+namesCount);
        for(int x=0; x<namesCount; x++){
            System.out.println(names[x]);//currentNames==>>names[]
            System.out.println(names[x]+" has charecter count \n"+names[x].length());
       String myFavoriteName=names[3];
            System.out.println("my Favorite name "+myFavoriteName+" char count is "+myFavoriteName.length());


        }





    }
}
