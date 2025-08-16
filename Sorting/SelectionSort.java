//Write the code to sort an array using SelectionSort

import java.util.Arrays;
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {3,1,5,4,2};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
        
    }

    static void selectionSort(int[]arr){
        for(int i = 0; i<arr.length; i++){
            //find the maximum item in the remaining array and swap with correct index

            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swapElements(arr, maxIndex, last);
        }
    }


    //finding the maximum
    static int getMaxIndex(int[]arr, int start, int last){

        int max = start;

        for(int i = start; i<=last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }


    //Creating a function for swapping

    static void swapElements(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}