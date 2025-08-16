//Sort an array using selection sort(practice)
import java.util.*;
public class SortArraySelection {
    public static void main(String[] args) {
        int[] arr = {4, 2, 55, 98, 1, 9, -1};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    //Select the maxelement and put it to right place

    static void selectionSort(int[]arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length - i -1;

            int max = getMaxIndex(arr, 0, last);

            swapNumbers(arr, max, last);

            
        }
    }

     //Function to get the maximum element

       static int getMaxIndex(int[]arr, int start, int last){

        int max = start;

        for(int i = start; i<=last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }


    //Function to swap

    static void swapNumbers(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
        
    
}
