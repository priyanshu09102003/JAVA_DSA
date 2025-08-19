//Sort an array using the insertion sort

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[]arr = {5, 3, 4, 1, 22, 8, 12, 6, 2};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));


        
    }

    //function for insertion sort

    static void insertionSort(int[]arr){
        for(int i = 0 ; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    //Swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

                else{
                    break;
                }
            }
        }
    }
}