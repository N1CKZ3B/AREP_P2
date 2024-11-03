package edu.eci.arep;

import java.util.ArrayList;

public class LinearSearch {
    int result;
    public LinearSearch(int[] arr, int num){
        result = linearSearch(arr,num);
    }
    private int linearSearch(int[] arr, int num){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public int getResult() {
        return result;
    }
}
