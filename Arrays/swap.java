import java.lang.reflect.Array;
import java.util.Arrays;

public class swap {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int i : arr){
            System.out.print("Original array is: " + Arrays.toString(arr));
        }

        swap(arr , 1, 2);

        for (int i : arr){
            System.out.print("Swapping 1st and 2nd Index: " + Arrays.toString(arr));
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}