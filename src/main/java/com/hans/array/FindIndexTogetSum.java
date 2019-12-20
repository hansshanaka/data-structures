package com.hans.array;

import java.util.Scanner;

public class FindIndexTogetSum {

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 4, 9, 0, 11};
//        Scanner scanner = new Scanner(System.in);
//        int target = scanner.nextInt();

        getIndexes(arr,9);
    }

    static void getIndexes(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            int curSum = 0;
            for (int j=i;j<arr.length;j++){
                curSum += arr[j];

                if(curSum == target){
                    System.out.println("Sum Can get following values "+ arr[i] +" and "+
                            arr[j]);
                }
            }
        }
    }
}
