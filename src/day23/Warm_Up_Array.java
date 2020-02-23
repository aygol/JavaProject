package day23;

public class Warm_Up_Array {
    public static void main(String[] args) {

        int [] item= new int []{1,3,4,9,12,14,24};//int[]nums=new int[4] ;scores[0]=95;
      //  nums[1]=70;***
      //  nums[2]=88;***
      //  nums[3]=100;*** SHORTHEST WAY==>>>>>int[] nums3={11,2,12,1,43,6,2} f0r(int x=nums.length-1; x>=0;x--)
            for(int i=6; i>=0; i--){
      System.out.print(item[i]+" ");

 }
int arraySize=item.length;
            int lastItemIndex=arraySize-1;
     int lastItemValue=arraySize-1;
     lastItemValue=item[lastItemIndex];

        System.out.println("last Item Value = "+lastItemValue);
        int middleItemIndex=arraySize/2;
        System.out.println("middle item value = "+item[middleItemIndex]);
int sum=0;
for(int x=0; x<arraySize; x++){
    int currentItem=item [x];
    sum=sum+currentItem;
}


        System.out.println("sum "+sum);








    }
}
