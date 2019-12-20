package com.hans.array;

import java.util.HashSet;

public class FirstRepeatingEl {

    public static void main(String[] args) {
        int[] arr = {2, 10, 7, 8, 1, 1, 8, 7, 6, 1};
        int min = getRepeatEl(arr);
        System.out.println("--------------");
        if (min != -1)
            System.out.println("The first repeating element in array is " + arr[min]);
        else
            System.out.println("There are no repeating elements");
    }



    static int getRepeatEl(int[] arr){
        int repIndex = -1;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i= 0; i<arr.length; i++){
            if(set.contains(arr[i])){
                repIndex = i;
                break;
            }else {
                set.add(arr[i]);
            }
        }
        return repIndex;
    }
}
