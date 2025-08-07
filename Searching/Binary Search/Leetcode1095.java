//You may recall that an array arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

// You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

// MountainArray.get(k) returns the element of the array at index k (0-indexed).
// MountainArray.length() returns the length of the array. [LEETCODE HARD]

public class Leetcode1095 {

    

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(finalAns(arr, target));;

    }

    static int finalAns(int[]arr, int target){
        int peakElement = peakElementinMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peakElement);

        if(firstTry != -1){
            return firstTry;
        }
        //try to search in the second half

        return orderAgnosticBinarySearch(arr, target, peakElement, arr.length-1);
    }

    static int peakElementinMountainArray(int[]arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }

        }

        return start;

    }

   static int orderAgnosticBinarySearch(int[]arr, int target , int start, int end){

        boolean isAscending = arr[start] < arr[end];

        while (start<=end) {
            int mid = start + (end-start) / 2;

           if(arr[mid] == target){
            return mid;
           }

           if(isAscending){
            if(arr[mid]<target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
           }

           else{
            start = mid+1;
           }
        }

        return -1;
   }
    
    
}