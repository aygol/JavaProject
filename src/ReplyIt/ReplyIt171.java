package ReplyIt;

import java.util.Arrays;

public class ReplyIt171 {
    public static void main(String[] args) {
    String[][] chessBoard = new String[8][8];
    //WRITE YOUR CODE HERE



    for(int i=0;i<chessBoard.length;i++){
        char a='a';
        for(int j=0;j<chessBoard[i].length;j++) {
            chessBoard [i][j]=(i+1)+""+(a);
       a++;
        }
    }

    //DO NOT CHANGE
    System.out.println(Arrays.deepToString(chessBoard));
}
}

