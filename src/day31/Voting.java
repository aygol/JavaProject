package day31;

public class Voting {
    public static void main(String[] args) {
checkEligibility(15);
checkEligibility(64);
checkEligibility(23);
int yourAge=12;
checkEligibility(yourAge);
    }   public static void checkEligibility(int age){
  //  int age=15;
        if(age>18){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");}








}}
