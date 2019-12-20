package com.hans.array;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    static void findFrequenncy(int arr[]){
        HashMap<Integer,Integer> elements = new HashMap<Integer, Integer>();
        for (int i= 0; i<arr.length;i++){
            int el = arr[i];
            if(elements.get(el) == null){
                elements.put(el,1);
            }else{
                elements.put(el,elements.get(el)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: elements.entrySet()){
            System.out.println("Frequency of "+entry.getKey()+" is :"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 5, 5, 6, 6};
        findFrequenncy(arr);
    }
}
