package day27;

public class DevelopinTeamArray {
    public static void main(String[] args) {
        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchack", "Mohammed", "Sohrabi", "Nursultan"};
        String[] businesAnalysitsTeam = {"Lisa", "Ershad", "Naile"};
        String[][] scrumTeam = {developersTeam, testerTeam, businesAnalysitsTeam};
        String longestString="";
        int maxLength = scrumTeam[0][0].length();
        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {
                if (maxLength < eachElement.length()) {
maxLength=eachElement.length();
 longestString=eachElement;
                }

            }
        }
        System.out.println("Longest String = "+longestString+" maxLength "+maxLength);

    }}