package day53_Polimorphism;

public class FruitShopUtility {
    public static void main(String[] args) {
        Fruit f2=new Apple("tasteless","hot red", "Gala");
        Fruit f3=new Orange("Sour","orange",12);
        Fruit f4=new Orange("very sweet","Blood Red", 10);
        displayFruit(f2);
        displayFruit(f3);
        displayFruit(f2);
        displayFruit(new Orange("very sweet","Yellovish", 13));
        Fruit x=getMyFavoriteFruit();
        System.out.println("************");
       // System.out.println(x);
        x.getDigested();
        System.out.println("B15 Favarite Fruit = "+x);
        System.out.println("get Favarite Fruit = "+getFavoriteByType(1));
        System.out.println("get Favarite Fruit = "+getFavoriteByType(2));
        System.out.println("get Favarite Fruit = "+getFavoriteByType(3));
    }
    public static void displayFruit(Fruit anyFruit) {
        System.out.println("Displaying fruit "+anyFruit.toString());
    } public static void sellFruit(Fruit anyFruit) {
        System.out.println("Selling fruit "+anyFruit.toString());

    }//create a static void method called digestbetter
    //it has a parameter as type Fruit
    //and inside the method it will digest the fruit object for times then displayInformation
    //Create a static method called getMyFavorite Fruit
    //Aceept no paramater and return your Favorite Fruit Object
    //displayFruit
    public static void digestBetter(Fruit anyFruit){
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        System.out.println("anyFruit = "+anyFruit);

    }public static Fruit getMyFavoriteFruit() {
        Fruit f = new Orange("cripsy", "green", 10);
        return f;
    }public static Fruit getFavoriteByType(int type){
        if(type==1){
            return new Orange("very sweet","Yellovish", 13);
        }else if(type==2){
            return new Apple("tasteless","hot red", "Gala");
        }else {
            return null;
        }
    }
}
