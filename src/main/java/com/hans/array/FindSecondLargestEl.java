package com.hans.array;

public class FindSecondLargestEl {

    private static int secondLargestEl(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i=0; i<arr.length;i++){
            if(arr[i]>first){
                //--assign second largest el to first largest el
                second = first;

                //--current element is assigned to first el
                first = arr[i];
            }else if(arr[i]>second){
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {7,5,6,1,4,2};
        System.out.println("Second Largest El "+ secondLargestEl(arr));
    }
}
