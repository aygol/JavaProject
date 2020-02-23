package interview;

public class PrintingAlphabe {
    //	9_01 Print A to Z adding one more at each line in 26 rows
//		 A
//		 AB
//		 ABC
public static void alphabe() {
    for (int i = 'a'; i <= 'z'; i++) {
      //  System.out.print((char)i);
    }
}
    public static void main(String[] args) {

        String str = "";

        for(int i = 65; i < 65+26; i++) {
            str += (char)i;
            System.out.println(str);
        }alphabe();
    }
}

