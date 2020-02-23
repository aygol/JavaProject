package day33;

public class DayToAge {
    public static void main(String[] args) {
        System.out.println(calculateAndReturnAge(1975,2019));
        System.out.println(calculateAndReturnAge(1945,2019));
    }

    public static int calculateAndReturnAge(int birthYear,int currentYear) {

        int age = 0;
      //  int currentYear = 2019;

        if (birthYear < 1900 || birthYear > 2019) {

//if I reach this point it means the birth year is valid
            return 0;
        }

        else if (birthYear >= 1900 || birthYear <= 2019) {
            age += currentYear - birthYear;

        }return age;

    }

}