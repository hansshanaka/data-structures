package com.hans.array;

import java.sql.SQLOutput;

public class MeargeSort {

    static void printArray(int[] arr){
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //--recursive algorithm for marge sort
    static void margeSort(int low, int high){

        int mid = low +((high-low)/2);
        if(low<high){
            //--sort left half
            margeSort(low,high);

        }

    }

    public static void main(String[] args) {
        int arr[] = {100,20,15,30,5,75,40};
        System.out.println("------------------");
        System.out.println();
        System.out.println("----Before Sort------");
        printArray(arr);
    }
}
