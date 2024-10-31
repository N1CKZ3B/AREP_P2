package edu.eci.arep;

public class BinarySearch {

    public int[] ordenar(int[] arr){
        int cont = 0;
        int aux = 0;
        while (cont != 0){
            cont = 0;
            for (int i = 0 ; i < arr.length-1 ; i++){
                if(arr[i+1] < arr[i]){
                    cont += 1;
                    aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                }
            }
        }
        return arr;
    }


    public int binS(int[] arr , int num){
        int m = arr.length / 2;
        if (arr[m] == num){
            return m;
        }else if ( arr[m] > num){
           return binS(arr,num);
        }else{
            return binS(arr,num);
        }
    }

    public int BinarySearch(int[] arr, int num) {
        int[] array = ordenar(arr);

        return binS(arr,num);
    }
}
