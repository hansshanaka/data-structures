package com.hans.array;

/**
 * search an element in a sorted and rotated array in java
 */
public class BinarySearch {

    private static int findElement(int arr[],int low, int high, int numb){

        int mid;
        while (low <= high){
            mid = low+((high-low)/2);
            if(arr[mid] == numb){
                return mid;
            }
            if(arr[mid] <= arr[high]){
                //---right part is sorted
                if(numb > arr[mid] && numb <= arr[high]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }else {
                //---left part is sorted
                if(numb < arr[mid] && numb >= arr[low]){
                    high = mid -1;
                }else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {16,19,21,25,3,5,8,10};

        System.out.println(arr.length);

        System.out.println("Index of element 5 : "+
                findElement(arr,0,arr.length-1,5));
    }
}
