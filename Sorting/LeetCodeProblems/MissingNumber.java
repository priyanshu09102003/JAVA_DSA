//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

// Example 1:

// Input: nums = [3,0,1]

// Output: 2

// Explanation:

// n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

package LeetCodeProblems;

public class MissingNumber {
    public static void main(String[] args) {
        
    }

    static int missingNumber(int[]arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
        }

        //search for missing number
        for(int index = 0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
