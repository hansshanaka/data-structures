package com.hans.array;

import java.util.Arrays;

public class FindMinimumPlatform {

    static int getPlatform(int arr[], int dep[] ){
        int plaform_need =0 , maxPlatform = 0;
        int i =0 ,j =0;

        Arrays.sort(arr);
        Arrays.sort(dep);

        while (i< arr.length && j< dep.length){

            if(arr[i] < dep[j]){
                plaform_need++;
                i++;
                if(plaform_need > maxPlatform)
                    maxPlatform = plaform_need;
            }else {
                plaform_need--;
                j++;
            }
        }
        return maxPlatform;
    }

    public static void main(String[] args) {
        // arr[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00}
        // dep[] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00}

        //--arrival array
        int[] arr={100,140,150,200,215,400};

        //--departure array
        int[] dep={110,300,220,230,315,600};

        System.out.println("Platform need "+ getPlatform(arr,dep));
    }
}
