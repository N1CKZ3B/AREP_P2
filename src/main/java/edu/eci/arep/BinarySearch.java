package edu.eci.arep;

public class BinarySearch {
    int result;
    public BinarySearch(int[] array, int target){
        result= binarySearch(array, target);
    }

    private int binarySearch(int[] array, int target) {
        int left = 0;
        int rigth = array.length -1;

        while (left <= rigth){
            int mid = left + (rigth - left)/2;

            if (array[mid] == target){
                return mid;
            }else if (array[mid] < target){
                left = mid + 1;
            }else{
                rigth = mid -1;
            }
        }

        return -1;

    }

    public int getResult(){
        return result;
    }
}
