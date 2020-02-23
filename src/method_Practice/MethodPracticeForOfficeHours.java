package method_Practice;

public class MethodPracticeForOfficeHours {
    public static void main(String[] args) {
        //1.  write a return method called RemoveDup that accepts a String and removes duplicate values from the String
        //Ex:
        //	RemoveDuplicate("aaabbbccc") ==> "abc"

        RemoveDup("aaabbbccc");
        System.out.println(removeDuolicated("ABDDDCCCDDD"));
        frequency("AABBCCDC", 'C');
        System.out.println("  frequency(\"AABBCCDC\",'C') " + frequency("AABBCCDC", 'C'));
        System.out.println("************************************");
        frequencyOfChars("ABDDDCCCDDD");
    }
    public static void RemoveDup(String str) {
        String result1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result1.contains(str.substring(i, i + 1))) {
                result1 += str.substring(i, i + 1);
            }
        }
        System.out.println(result1);
    }
    public static String removeDuolicated(String str) {
        String result1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result1.contains("" + str.charAt(i))) {
                result1 += str.charAt(i);
            }
        }
        return result1;
        // //2. write a return method called Frequency that accepts String and  char, the method will return the total number of ocuurence of the given char in the given string
//        //Ex:
//        //	Frequency("AAABBB", 'A') ==> 3}
    }

    public static int frequency(String str, char ch) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (char each : arr) {
            if (each == ch) {
                count += 1;
            }
        }
        return count;
    }//   //3. Combined the methods 1 & 2 to write a method that prints the the frequency of each characters from the given String
//Ex:
//	FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"}
    public static void frequencyOfChars(String str){//"AAABBBCCCCC";
   String nonDup="";
     nonDup=     removeDuolicated(str) ;
     for (int i = 0; i < str.length(); i++){
     int count=frequency(str, nonDup.charAt(i));
     System.out.print(""+nonDup.charAt(i)+count);
    }

}}