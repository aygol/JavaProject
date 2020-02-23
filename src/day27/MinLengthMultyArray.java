package day27;

public class MinLengthMultyArray {
    public static void main(String[] args) {
        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchack", "Mohammed", "Sohrabi", "Nursultan"};
        String[] businesAnalysitsTeam = {"Lisa", "Ershad", "Naile"};
        String[][] scrumTeam = {developersTeam, testerTeam, businesAnalysitsTeam};
        String shortestString="";
        int minLength = scrumTeam[0][0].length();
        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {
                if (minLength >eachElement.length()) {
                    minLength=eachElement.length();
                    shortestString=eachElement;
                }
            }
        }
        System.out.println("shortestString = "+shortestString+" minLength "+minLength);
      //second wqy
      for(int i=0; i<scrumTeam.length;i++){
          for(int j=0; j<scrumTeam[i].length;j++){
        if(minLength>scrumTeam[i][j].length()){
     minLength=scrumTeam[i] [j] .length();




        }




          }
}}}
