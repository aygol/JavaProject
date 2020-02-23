package ReplyIt;

public class Carpet {
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below
    public Carpet(){
        this. width=300;
        this.length=300;
        if(isPersian==true){
            this.totalPrice=200;

        }else{this.totalPrice=0;}}
    public Carpet(double width,double length, double unitPrice,boolean isPersian){
        this. width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;
        if(isPersian==true){
            totalPrice+=(width*length)*unitPrice+200;}
        else {
            totalPrice+=(width*length)*unitPrice;
        }
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}

