
import java.util.*;
public class CyclicSortpractice {

    public static void main(String[] args) {

        int[]arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    static void cyclicSort(int[]arr){
        int i = 0;

        while(i<arr.length){
            int corrctIndex = arr[i]-1;

            if(arr[i] != arr[corrctIndex] ){
                swap(arr, i, corrctIndex);
            }

            else{
                i++;
            }
        }
    }

    static void swap(int[]arr, int firstElement, int secondElement){
        int temp = arr[firstElement];
        arr[firstElement]=arr[secondElement];
        arr[secondElement] = temp;
    }
}