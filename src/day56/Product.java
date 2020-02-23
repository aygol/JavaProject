package day56;

import java.util.Objects;

public class Product extends Object{
    // //equals() method was comparing if we have different object or not
    ////we wrote our equals() method by comparing name and price of different two objects
    //        //when the name and price is same it returns true
    //        //it does not mean that we have same object!!!!!!
    private int price;
    private String name;

    public Product(String name,int price) {

        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                name.equals(product.name);
    }public boolean equals(Product otherProduct) {


        return this.name.equals(otherProduct.name)&&
                this.price==(otherProduct.price);}


    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }
//Create a class called Product with encapsulated fields name, price and constructor
    //override the .equals method coming from Object class :
    //Two products should be equal if they have the same fields value.
    //Practice Association: important
    //create a class called Store
    //It has List<Product> as instance variable
    //no arg constructor to initilize the list to empty ArrayList object
    //1 Arg constructor to accept List<Product>
    //First line of constructor should call nonath constructor to reuse initialization logic.
    //Inside constructor AddAll Products user passed to the instance variable last.
    //Create an instance void method called addProduct(Product p)
    //Create an instance void method called removeProduct(Product p)
    //Create an instance void method called checkIfProductExist(Product p)
    //Hint : just call list remove method, it will internally call .equal method to decide which one to remove
    //more methods : find and return max price product, Find sum.of all products
}
