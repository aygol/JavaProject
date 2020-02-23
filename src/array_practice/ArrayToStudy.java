package array_practice;

public class ArrayToStudy {
    public static void main(String[] args) {
        String str= "Sunday perfect day to start coding";
        //reverse the string
        for(int x=str.length()-1;x>=0;x--){
            System.out.println(str.charAt(x));
        }
String[]str2=str.split(" ");
        for(int i=str2.length-1;i>=0;i--) {
        //    System.out.print(str2[i]);
            if (i != 0) {
                System.out.print("- ");
            }


        }  String strREv=" " ;
          for(int i=0; i<str2.length/2;i++){

String temp=str2[i];
str2[i]=str2[(str2.length-1)-i];
              str2[(str2.length-1)-i]=temp;


          }


    }




    }

