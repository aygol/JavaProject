package ReplyIt;

import java.util.Scanner;

public class Reply132 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        //WRITE YOUR CODE HERE
        for(int i=0;i<score.length;i++) {
            score[i]=input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float difficulty=input.nextFloat();
    float   total;
        float sum=0.0f;
        float min=score[0];
        float max=score[0];
        for(int i=0;i<score.length;i++) {
            if(score[i]<min ){
                min=score[i];
            }
        }  for(int i=0;i<score.length;i++) {
            if(score[i]>max ){
                max=score[i];

            }}for(int i=0;i<score.length;i++) {
             sum+=score[i];


            }total =((sum-(min+max))*difficulty)*0.6f;
        System.out.println(max);


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}


