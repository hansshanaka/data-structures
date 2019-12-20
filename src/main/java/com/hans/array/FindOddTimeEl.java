package com.hans.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Find odd time element in an array
 */
public class FindOddTimeEl {

    //--Using hashing
    private static int oddTiemEl(int[] arr){

        int num;
        HashMap<Integer,Integer> elements = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){

            int element = arr[i];
            if(elements.get(element) == null){
                elements.put(element,1);
            }else {
                elements.put(element,elements.get(element)+1);
            }
        }
        for (Map.Entry<Integer,Integer>entry : elements.entrySet()){
            if(entry.getValue()%2==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    //--- Use XOR operation
    static int oddTimeElUsingor(int[] arr){
        int num =0;
        for (int i=0; i<arr.length;i++){
            num = num ^ arr[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        System.out.println("Odd Time Element "+ oddTiemEl(array));;
        System.out.println("Odd Time Element Using XOR "+ oddTimeElUsingor(array));;
    }
}
