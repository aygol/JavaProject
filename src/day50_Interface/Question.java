package day50_Interface;

public abstract class Question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType="Unknown";
 public   abstract void calculate();

    public  Question(String questionType, String operator){
        this.questionType=questionType;
        this.operator=operator;

    }

    @Override
    public String toString() {
        return "Question{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", operator='" + operator + '\'' +
                ", answer=" + answer +
                ", calculated=" + calculated +
                ", questionType='" + questionType + '\'' +
                '}';
    }


}
