package day19;

public class InterviewQuestion {
    public static void main(String[] args) {
        //get the sum of numbers from 1-10
        //it's interesting 1+2+3+4+5+6+8+9+10 HOw much is it?
       int sum=0;//nothing has been added yet so 0
       for(int i=1; i<=10; i++){
        sum= sum+i;
           System.out.println(sum);
       }



    }
}
