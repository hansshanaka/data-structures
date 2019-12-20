package com.hans.array;

/**
 * Find Largest and Smallest elements
 *
 *
 */
public class FindLagestNSmallest {

    public static void main(String[] args) {

        int arr[] = {2,14,7,4,29,6,18};

        int smallest = arr[0];
        int largest = arr[0];

        for(int i =0; i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }else if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Value "+ smallest);
        System.out.println("Largest Value "+ largest);
    }
}
