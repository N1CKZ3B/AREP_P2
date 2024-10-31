package edu.eci.arep;

import java.util.ArrayList;

public class LinearSearch {
    public int linearSearch(int[] arr, int num){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
