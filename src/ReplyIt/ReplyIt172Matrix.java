package ReplyIt;

import java.util.Scanner;

public class ReplyIt172Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     //   int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
     //           {scan.nextInt(), scan.nextInt(), scan.nextInt()},
     //           {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int[][] matrix={{1,2,3},{4, 5, 6},{9,8,9}};
     int   result = 0;
        result+=( matrix[0][0]+ matrix[1][1]+matrix[2][2])-(matrix[0][2]+ matrix[1][1]+matrix[2][0]);

//for(int i=0;i<matrix.length;i++){     easy way to do it
//  result+=matrix[i][i];
//  result -= matrix[i][(matrix.length-1)-i];
//}
        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}

//1 2 3
//4 5 6
//9 8 9



