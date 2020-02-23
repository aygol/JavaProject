package day19;

public class Speed1 {
    public static void main(String[] args) {
        ///dcreate class called speed action create 2 int variables called start ,
        //// end assuming atart speed is always less than wnd speed create a for loop to stumulate slow incrase of the speed,
        //        //for example if start 10, end 27
        //        //print --->10, 11 , 12, 13....27
//for(int i=1;i=10;i++;){how to count 1 to 10
       int start=10;
       int end=27;
      //  System.out.println("you have started at speed--->");
      //  for(int i=startSpeed;i<=endSpeed;i++){
if(start<end){
    System.out.println("increasing the speed");
    for(int i=start; i<=end;i++) {
        System.out.println(i + ",");}
    }else if(start>end) {
    System.out.println("decreasing the speed");
    for(int i=start; i>=end;i--) {
        System.out.println(i + ",");}
    }
}
        //    System.out.print(i+",");
        }
//lets write sudo code for if start>end situation
        //  and if start<end situation the speed less than end teh speed supposed to be decreased 45 44 43 42 41
//for(int i=start; i>





