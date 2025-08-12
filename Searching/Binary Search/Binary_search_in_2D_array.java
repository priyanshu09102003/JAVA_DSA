//Search in a Row-Column sorted Matrix

import java.util.Arrays;

public class Binary_search_in_2D_array {

    public static void main(String[] args) {

        int[][] matrix = {
            {10 , 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        int target = 37;

        System.out.println(Arrays.toString(searchIn2DArray(matrix, target)));
        
    }

    static int[] searchIn2DArray(int[][]arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >=0){
            if(arr[row][col] == target){
                return new int[]{row , col};
            }

            if(arr[row][col] < target){
                row++;
            }

           else{
                col -- ;
            }
            
        }

        return new int[] {-1 , -1};
    }
    
}
