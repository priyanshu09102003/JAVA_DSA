//Code for sorting an array by BUBBLE SORT

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {2, 1, 8, 4, 3, 56, 44, 82, 120, 24};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[]arr){
        //run the steps n-1 times

        for(int i = 0; i<arr.length; i++){
            //for each step, maximum value will come at the last of their respective index

            for(int j = 1; j<arr.length - i; j++){

                //compare and swap if the adjacent item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap the values

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    }
}
