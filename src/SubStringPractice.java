public class SubStringPractice {
    public static void main(String[] args) {
      String movie="Lord Of the Ring";

        //take of the "of"

   String wordOf=movie.substring(5,7) ;

        System.out.println("word Of "+wordOf);
        String wordThe=movie.substring(8,11) ;
        System.out.println("word The "+wordThe);
    //string movie  get from the secondword till last word
        int startingPoint=movie.indexOf(" ")+1;
        int endingPoint=movie.length();
        System.out.println("second word till last: "+movie.substring(startingPoint,endingPoint));
        String secondToLast=movie.substring(5);
        System.out.println("second word till last: "+secondToLast);
//      "Lord Of the Ring"    turn  ( Ring Of the Lord;
      String turn1=movie.substring(0,4);//lord
        String turn2=movie.substring(5,7);//of
        String turn3=movie.substring(8,11);//the
        String turn4=movie.substring(12,16);//ring
        System.out.println(turn4+" "+turn2+" "+turn3+" "+turn1);
//turn----->RIng of the Java Lord;
        System.out.println(turn4+" "+turn2+" "+turn3+" "+"Java "+turn1);
    }
}
