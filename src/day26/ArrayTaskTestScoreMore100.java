package day26;

public class ArrayTaskTestScoreMore100 {
    public static void main(String[] args) {
        // //// 1, write a program to test all the element in an int array more that 100
        //        //// 2, write a program to print count of certain item in an array.
        //        //       if item does not exists it should print 0 , if not print the count of the item
        //        //// 3 , given a String with multiple word. get an array of words then reverse the array
        //        //// 4 , OPTIONAL : reverse each word in a sentence after getting an array of word
    int []scores={156,101,76,187,87,110};
    String finalResult="";//if all numbers more than 100 count then make than 100 or not
    //logic 1 if each numbers less than 100, count in thhe end if count is more than0 answwer is no
//


    int count=0;
    for(int eachNum:scores){
    if (eachNum>100)  {
        System.out.println("eachNum=="+eachNum);
        count++;
    }
    }
        System.out.println("count more than 100 is "+count);
//logic 2 cheeck item and break when number
int countlessthan=0;
for(int eachNum:scores){
    if(eachNum<100){
        countlessthan++;
    }
}
        System.out.println("if number less then 100 is ="+countlessthan);
if(scores.length==count){
    finalResult="Yes";
}else{
    finalResult="No";
}
        System.out.println("finalResult = "+finalResult);
for(int each:scores){
    if(each<=100){
        finalResult="No";
        break;
    }
}
        System.out.println("finalResult ="+finalResult);
for(int each:scores){
    if(each%2==0){
        finalResult="No";
        break;
    }
}
        System.out.println("finalResult for odd = "+finalResult);

    }
}
