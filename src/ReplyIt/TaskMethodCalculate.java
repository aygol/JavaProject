package ReplyIt;

public class TaskMethodCalculate {

    public static void main(String[] args) {

            calculate(5,8,"-");
            calculate(5,8,"+");
            calculate(5,8,"*");
            calculate(5,8,"/");
            calculate(5,8,"%");
            gradeCalculator(90);
            gradeCalculator(54);
        gradeCalculator(91);
        gradeCalculator(55);
        gradeCalculator(190);
        gradeCalculator(74);
        gradeCalculator(61);
        gradeCalculator(85);
        gradeCalculator(-5);
        }public static void calculate (int a , int b,String operators){
            boolean result=!operators.equals("-")&&!operators.equals("+")&&!operators.equals("*")&&!operators.equals("/")&&!operators.equals("%");
            if(result) {
                System.out.println("invalid operator");
                return;
            } if (operators.equals("-")) {

                System.out.println(a - b);
            } else if (operators.equals("+")) {

                System.out.println(a + b);

            } else if (operators.equals("*")) {

                System.out.println(a * b);
            } else if (operators.equals("/")) {

                System.out.println(a / b);
            } else if (operators.equals("%")) {

                System.out.println(a % b);
            }
        } public static void gradeCalculator(double score) {
        //	5. write a method that can calculate grade
        //			if score is 100 ~ 90 ==> A
        //				if score is 89 ~ 80 ==> B
        //				if score is 79 ~ 70 ==> C
        //				if score is 69 ~ 60 ==> D
        //				if score is 0 ~ 59 ==> F
        //  otherwise ==> Invalid Score
if(score >=90&& score<100) {
    System.out.println("Grade A");
    return;
}else if(score>=80&&score<=89){
    System.out.println("Grade B");
    return;
}else if(score>=70&&score<=79){
        System.out.println("Grade C");
        return;
    }else if(score>=60&&score<=69){
        System.out.println("Grade D");
        return;
    }else if(score>=50&&score<=59){
        System.out.println("Grade F");
        return;
    }else{
    System.out.println("Invalid Score");
    }
}}