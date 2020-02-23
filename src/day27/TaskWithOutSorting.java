package day27;

public class TaskWithOutSorting {
    public static void main(String[] args) {
        int[] score = {100, 897, 653, 32, 1231, 224, 556, 7, 1, 2, 3, 4};//write program prinmnimum number without sorting
        int min = 999999999;//int min=score[0];
        for (int i = 0; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.println("minimum number = " + min);
        int secondMin = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] == min) {
                continue;
            }
            if (secondMin > score[i]) {
                secondMin = score[i];
            }
        }
        System.out.println("secondMin = " + secondMin);
        int thirdMin = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] == min || score[i] == secondMin) {
                continue;
            }
            if (thirdMin > score[i]) {
                thirdMin = score[i];


            }
        }
        System.out.println("thirdMin = " +thirdMin);
    }}