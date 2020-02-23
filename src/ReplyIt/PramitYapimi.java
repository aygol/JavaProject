package ReplyIt;

public class PramitYapimi {
    public static void main(String[] args) {

        int odd = 1;
        int size = 9;
        int noOfspaces = size - 1;
    for(int i=1;i<=size;i++) {
        int k = 0;
    for(int j=1;j<=noOfspaces;j++)
            System.out.println(" ");
        for(int j=1;j<=odd;j++)
         if(j<=i) {
           k = k + 1;
    }else {
      k=  k-1;
    }
        System.out.println(k);
        System.out.println();
        odd=odd+2;
        noOfspaces=noOfspaces-1;
        {
    }
    }}}










