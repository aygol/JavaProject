package ReplyIt;

public class ReplyBoolean {
    public static void main(String[] args) {
        System.out.println("elma ye armut yeme");
        System.out.println(wordCount("elma ye armut yeme"));
    }   public static int wordCount(String words) {
        int counter = 1;
        if (!words.contains(" ")) {
            counter = counter;
        }
      //  return counter;
         if   (words.contains(" ")) {
             for(int i=0; i<words.length()-1;i++){
                if(words.substring(i,i+1).equals(" ")){
                    counter++;
                }
            }


            }return counter;}}