package com.hans.array;

/**
 * Given array containing 1 to n but one of the number is missing.
 * Number can't be repeated
 */

public class FindMissingNo {

    private int missingNo(int[] arr){

        int missingNo = 0;
        int n= arr.length+1;
        int sum = n*(n+1)/2;
        int restSum = 0;
        for (int i = 0;i<arr.length;i++){
            restSum += arr[i];
        }
        missingNo = sum - restSum;
        return missingNo;
    }


    public static void main(String[] args) {
        int[] arr1 = {7,5,6,1,4,2};
        int[] arr2 = {5,3,1,2};

        FindMissingNo fmn = new FindMissingNo();

        System.out.println("Missing No in arr1 is "+ fmn.missingNo(arr1));
        System.out.println("Missing No in arr2 is "+ fmn.missingNo(arr2));
    }

}
