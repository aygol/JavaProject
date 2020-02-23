package homeWork;

import java.util.Arrays;

public class ArraySorter {
    //     Utility static method: isTitleWord
    //      -This method will be used in setTitle() method
    //      -Accepts a words to check if it is a part of the title or just an article etc.
    //      - The method returns false => if word parameter is one of articles, coordinate conjunctions, or prepositions. See full list below
    //      -else method returns true
    //      Articles:
    //     "a" , "an", "the"
    //      Coordinate conjunctions:
    //     "and", "but", "for", "nor", "or", "so", "yet"
    //     Most common single-word English prepositions:
    //     "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"
    //
    //     isTitleWord("Apple") => true
    //     isTitleWord("a") => false
    //     isTitleWord("BUT") => false
    //     isTitleWord("THE") => false
    //     isTitleWord("neaR") => false
    //     isTitleWord("java") => true
    //
    //     */
       public static Boolean isTitleWord(String word) {
    		if(word.equals("a")||word.equals("an")||word.equals("the")||word.equals("and")||word.equals("but")||word.equals("for")||
                    word.equals("nor")||word.equals("or")||word.equals("so")||word.equals("yet")||word.equals("at")||word.equals("by")||
                    word.equals("in")||word.equals("into")||word.equals("near")||word.equals("of")||word.equals("on")||word.equals("than")||word.equals("via")) {
return false;
            } else{
    		    return true;
            }
    //
    //    	return null;
    //
        }

    public static void main(String[] args) {
     int []  nums={1,4,2,34,8};
     int temp=0;
     for(int i=0; i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
      if(nums[i]>nums[j]) {
          temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
      }
         }

     } System.out.println(Arrays.toString(nums));
    String word="selin ";
      //  System.out.println(word.isEmpty());
        String result=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
}}
//nums = 1,4,2,34,8
//		 2,4,34,8
//		   4,34,8		    	original: 2,4,1,34,8
//		   	 8,34				soreted:  1,2,4,8,34
//		   	   34
//2. Swap elements.
//  create temporary veriable temp. Same type as our array. temp=nums1
//  		 nums1=nums2
//  		 nums2=temp
//Step1. Find local minumum for each array.