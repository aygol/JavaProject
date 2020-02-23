package day33;

public class methodWithReturnPractice {
    public static void main(String[] args) {
        System.out.println(convertNumberToDay(6));
        System.out.println(convertNumberToDay(16));
        int []allCodes={5,4,13,7,33};

    }

    public static String convertNumberToDay(int dayCode) {
        String dayName = "";

        switch (dayCode) {

            case 1:
       return         dayName = " Monday";
         //       break;
            case 2:
       return         dayName = "Tuesday";
          //      break;
            case 3:
       return         dayName = "Wendesday";
            //    break;
            case 4:
           return     dayName = "Thuesday";
               // break;
            case 5:
           return     dayName = "Friday";
          //      break;
            case 6:
                return       dayName = "Saturday";
            //    break;
            case 7:
              return  dayName = "Sunday";
              //  break;
            default:
                return "funday";

        }
    }


}