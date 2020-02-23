package day43;

public class Coffee {
 private double price;
 private int caffeinLevel;
 private String type;
//-- Constructor Review ---
//Integer i1 = new Integer(12);
//// how the constructor for Integer might look like
//public Integer(int num){
//	// some code here
//}
//Integer i1 = new Integer("12");
//public Integer(String num){
//	// some code here
//}
//Constructor is a block of code that run when object is being created
//	it has same name as class name
//	and has no return type
//	it can be overloaded
//Most use case of constructor is
//	to provide inititial state (attribute values)
//	for the object while being created
//public Coffee {
//	private String type;
//	private int caffeineLevel
//	private double price;
//	// getters and setters here omitted
//	// no arg constructor


//	// WAKE UP TASK TO CREATE 3 ARGS CONSTRUCTOR
//	// DO NOT LET THE PRICE GO BELOW 0
//	// IF IT's less than 0 make it 1$
public Coffee()
{
    System.out.println("no arg constructor");
	}
    public Coffee(String type, int level,int price){
        System.out.println();

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeinLevel() {
        return caffeinLevel;
    }

    public void setCaffeinLevel(int caffeinLevel) {
        this.caffeinLevel = caffeinLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if (price > 0) {
            this.price = price;
        } else {	        }
        this.price = 1;
    }



   public Coffee(String type, int caffeineLevel) {
       this.type = type;
       this.caffeinLevel = caffeineLevel;
       System.out.println("2 args constructor being called");
   }    public Coffee(String type, int caffeineLevel, double price) {
        this.type = type;	        this.type = type;
        this.caffeinLevel = caffeineLevel;
        // only set the value if the price is valid	        // only set the value if the price is valid
       // if (price > 0) {
       //     this.price = price;
     //   } else {	        }
      //      this.price = 1;
      setPrice(price);


        }	        }


