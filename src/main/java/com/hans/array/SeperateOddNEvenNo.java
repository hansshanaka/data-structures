package com.hans.array;

public class SeperateOddNEvenNo {

    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        System.out.println("Original Array");
        printArray(arr);
        System.out.println("Seperate Odd N Even No ");
        int a[] = getSeperateArray(arr);
        printArray(a);

    }

    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] getSeperateArray(int[] arr){
        int left = 0;
        int right = arr.length -1;

        for (int i =0;i<arr.length; i++){
            while (arr[left]%2 ==0){
                left++;
            }
            while (arr[right]%2 ==1){
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }

}
