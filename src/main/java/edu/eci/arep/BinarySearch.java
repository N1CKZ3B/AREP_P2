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

    }




    public int BinarySearch(int[] arr, int num){
        int[] array = ordenar(arr);
    }
}
