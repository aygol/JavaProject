package day41;

public class Product {
    private String name;
    private double price;
    public void setName(String newName){
        System.out.println(  name=newName); } //name=name1;

        public String getName(){
        return this. name;}
  public double getPrice() {
    return this.price;}
    public void setPrice(double newPrice){
        if (newPrice>0){
          this. price=newPrice;

        }
    }
}