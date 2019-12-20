package com.hans.array;

import java.util.Arrays;

/**
 * Array Creation
 * Find Array Size
 * Middle of the array
 * sort Array
 *
 */
public class ArrayImpl {

    /**
     * -----valid declarations
     * 1.int intArray[]
     * 2.int[] intArray
     */

    //--Middle of the array
    private void findMidl(int arr[]){
        int a[];
        if(arr.length % 2 == 0){
            //--even- length array two elements in middle
            a = new int[2];
            a[0] = arr[arr.length/2-1];
            a[1] = arr[arr.length/2];
        }else {
            a = new int[1];
            a[0] = arr[arr.length/2];
        }
        //---print middle
        for(int i=0;i<a.length;i++){
            System.out.println("Middle "+a[i]);
        }
    }

    private int findMidl(int[] arr, int low, int high){
        int mid = low +((high -low)/2);
        return mid;
    }

    //--sort an array
    private int[] sortArray(int[] arr){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        //declaring array
        int[] arr;

        // allocating memory to array
        arr = new int[10];

        //--combining both statements in one
        int[] a = new int[10];

        //---// Declaring array literal
        int al[] = new int[]{16,19,21,25,3,5,8,10};

        //--Array size
        System.out.println("Array Size "+al.length);

        //--accessing elements using for loop
        for (int i =0; i<al.length;i++){
            System.out.println(al[i]);
        }

        //---Middle Element step 1
        ArrayImpl array = new ArrayImpl();
        array.findMidl(al);

        //---Middle Element step 2
        int high = al.length-1;
        System.out.println("Middle step2 "+array.findMidl(al,0,high));;

        //Array sort
        System.out.println();
        int[] sa = array.sortArray(al);
        System.out.println("After Sort");
        System.out.println();
        for (int i=0;i<sa.length;i++){
            System.out.println(sa[i]);
        }
    }
}
