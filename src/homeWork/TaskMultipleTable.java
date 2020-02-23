package homeWork;

public class TaskMultipleTable {
    public static void main(String[] args) {
     int   count=1;
        for(int i=1;i<=12; i++){
            System.out.println();
            for(int j=1;j<=12; j++){
                count= i*j;
                System.out.println(i+" x "+j+" = "+ count);

            }
        }
    }
}
