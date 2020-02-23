package day26;

public class SplitPractice {
    public static void main(String[] args) {
        String survey = "Complete B15 Online 1 month survey";
        char[] surveyChars = survey.toCharArray();
        System.out.println();    //how we determine to use char for each? b
        for (char eachsurvey : surveyChars) {

            System.out.println("eachsurvey char is  " + eachsurvey);
        }
        System.out.println("**************");
        int x = 0;
        while (x < surveyChars.length) {
            System.out.println("eachsurvey char is  " + surveyChars[x]);
            x++;
        }
        System.out.println("**************");
        int y = 0;
        do {
            System.out.println(surveyChars[y]);
         y++;
        }while(y<surveyChars.length);

    }
}



