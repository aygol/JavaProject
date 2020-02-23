package method_Practice;

public class Array_method {
    public static void main(String[] args) {
int x=15;
int[]resultArr=getArrayFrom1ToX(x);
getArrayFrom1ToX(7);
        System.out.println(getArrayFrom1ToX(7));
        System.out.println(resultArr);
    }

    public static int [] getArrayFrom1ToX(int x) {
         x = 5;
int resultArr=0;
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }return arr;
    }
}