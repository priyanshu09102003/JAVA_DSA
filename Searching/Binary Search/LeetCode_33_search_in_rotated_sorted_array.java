//There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.



public class LeetCode_33_search_in_rotated_sorted_array {

    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(answer(nums, target));

        
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(mid< end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid] <  arr[mid+1]){
                return mid+1;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }

            else{
                start = mid+1;
            }
        }

        return -1;
    }

    static int binarySearch(int[]arr, int target , int start, int end){

        while(start <=end){
            int mid = start + (end-start) / 2;

            if(arr[mid] < target){
                start = mid + 1;
            }

            else if(arr[mid] > target){
                end = mid - 1;
            }

            else{
                return mid;
            }
        }

        return -1;
    }

    static int answer(int[]arr, int target){
        int pivot = findPivot(arr);

       //If pivot is not found, do normal binary search

       if(pivot == -1){
        binarySearch(arr, target, 0, arr.length - 1);
       }

       // if the pivot is found - two ascending sorted arrays

       if(arr[pivot] == target){
        return pivot;
       }

       if(target >= arr[0]){
        return binarySearch(arr, target, 0, pivot - 1);
       }

       return binarySearch(arr, target, pivot + 1 , arr.length - 1);
    }
}