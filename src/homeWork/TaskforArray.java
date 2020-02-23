package homeWork;

public class TaskforArray {
    public static void main(String[] args) {

//Nested Loop Practice, has no relationship with array here.
//Generate above output using nested loop
//The program is stimulating an Excel sheet with 6 rows and 4 columns

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("Cell" + "(" + i + "," + j + ") ");
            }
            System.out.println();


        }
        for (int i = 1; i <= 6; i++) {
            for (char j = 'A'; j <= 'D'; j++) {
                System.out.print("Cell" + "(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}