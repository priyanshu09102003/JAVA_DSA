//34. Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.


public class LeetCode34 {


    static int[] searchRange(int[] nums, int target) {

        int[]ans = {-1 , -1};

        int startValue = search(nums, target, true);
        int endValue = search(nums, target, false);

        ans[0] = startValue;
        ans[1] = endValue;

        return ans;
        
       
    }

    //Function index value of target occurence

    static int search(int[]nums , int target , boolean findStartIndex){
        
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = start + (end-start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }

            else if(target > nums[mid]){
                start = mid + 1;
            }

            else{
               ans = mid;

               if(findStartIndex){
                end = mid - 1;
               }

               else{
                start = mid + 1;
               }
            }
        }

        return ans;

    }
    
}
