package com.hans.array;

/**
 * In this example for linear search in array
 * Find the provided element in an array, if the
 * element is present then return the location,otherwise
 * return -1
 */

public class LinearSearch {

    private int lSerarch(int [] arr, int el){
        int index = 0;

        if(arr.length != 0){
            for (int i = 0; i<arr.length;i++){
                if(el == arr[i])
                    index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr [] = {2,56,23,1,7,9,12,52,86};
        LinearSearch ls = new LinearSearch();
        int index = ls.lSerarch(arr, 1);
        if(index != 0){
            System.out.println("element is present at index "+ index);
        }else {
            System.out.println("element isn't present in provided array");
        }

    }
}
