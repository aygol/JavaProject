package day50_Interface;

public class Division extends Question {
    public Division(int num1,int num2) {
        super("division question","/");
        this.num1=num1;
        this.num2=num2;
    }public void calculate(){
        answer=num1/num2;
        this.calculated=true;
    }public String toString() {
        if (calculated == true) {
            return num1 + operator + num2 + " = " + answer;
        } else {

            return num1 + operator + num2 + " = ";
        }


    }
}
