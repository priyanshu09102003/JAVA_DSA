import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {

        int []arr = {3, 5, 2, 1, 4};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    
        
    }

    static void Sort(int[]arr){
        int i = 0;

        while(i<arr.length){
            // Check if at correct index

            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }

            //otherwise, move forward

            else{
                i++;
            }
        }
    }

    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
