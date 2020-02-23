package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class TaskColum {
    public static void main(String[] args) {
   /*     Additional Task on this :
        1, Write a program to ask user row and column number and return the value in that cell. if it's invalid row or column number , it should print invalid input.
        for example : row 1 and column 4 has 84
        row 7 and column 1 -->> INVALID! There are only 6 row and 4 columns
        Optionally : keep asking user until the user input row and column are not out of range.
        2, Write a program to search a value in excel and print the all location of the value :
        for example : 67 --> Cell(4,1)  Cell(4,4) Cell(6,1)
        3, Write a program to ask user for column number and print only that column data :
        for example : 2 -->  54 , 44 , 88 , 33 , 88 , 33*/
 Scanner scan=new Scanner(System.in);
  int[][]cell=new int[6][4];
  int row;
  int column;
  int value;
  do {
      System.out.println("please enter row number");
      row = scan.nextInt();
      System.out.println("please enter column number");
       column = scan.nextInt();
      System.out.println("what is the value ?");
     value=scan.nextInt();

  }while(row<7||column<4) ;
       System.out.println("INVALID!");

       for( row=0; row<cell.length;row++){
      for( column=0; column<cell[row].length;column++)  {
         cell[row][column]=column*row;


 }
           System.out.println(cell[row][column]);}}}












