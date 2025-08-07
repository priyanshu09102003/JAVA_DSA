// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

// Return the index of the peak element.

// Your task is to solve it in O(log(n)) time complexity.


public class LeetCode852_peakIndexInMountainArray {
    public static void main(String[] args) {
        
    }
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                //We are in the decresing part of the array, so looking at the other half

                end = mid;
            }
            else{
                start = mid+1;
            }

        }

        //Start == end, pointing to the largest number
        //Return start/end as both are equal
        return start;
        
    }
}
