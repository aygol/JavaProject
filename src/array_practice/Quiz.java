package array_practice;

public class Quiz {
    public static void main(String[] args) {

        int num =9;

        if(num++ == 10) {  // line 1

            System.out.println("Hello World "+num);    // line 2

        }

        else {

            System.out.println("Hello Universe "+num);  // line 3//"Hello Universe "+10

        }//  //  What's the output?
    //    Given:

/////////////////////////////////////////////

            int score=0;

            if(score == 0) {

                score += 50;

            }

            if(score !=0 ) {

                score +=50;

            }  //  What's the output?

            System.out.println(score);//output 100 olur
//3.soru
        char grade ='A';

        boolean Passed = grade == 'A' || grade =='B';

        boolean Passed2 =grade == 'C' || grade =='D';



        if( Passed || Passed2) {

            System.out.println("You've passed the exam");

        }

        else {
// What's the output?
            System.out.println("You failed");//output= You've passed the exam
//////////////////////////////////////////////////////////////////////////////////////////
        }boolean A = true, B =  !false;

        if(B) {

            System.out.println("B");

        }

        else if(A) {

            System.out.println("A");

        }

        else {

            System.out.println("C");
//  What's the result?//====="B"
        }
        boolean result = true;

        if(result) {

            System.out.println("it's true");

        }

        else {

            System.out.println("it's false");

        }

//else if(result) {                         compile error
// What's the result?
            System.out.println("None of the above");
//////////////////////////////////////////////////////////////////
        int number =10;

        if(--number > 10) {

            System.out.println("Hello Cybertek "+number);

        }else if(number ==9) {

            System.out.println("Hello World "+number);
//outpup          Hello World 9
            //////////////////////////////////////////////////////
            boolean X = true;

            boolean Y = !X==false;

            boolean Z = Y;



            if( X ) {

                System.out.println("Hello Everyone");

            } if( Y ) {

                System.out.println("Today is great day");

            } if( Z ) {

                System.out.println("We have picnic on Saturday");
//output  Hello Everyone
//Today is great day
//We have picnic on Saturday
            }

        }
        }

    }




















