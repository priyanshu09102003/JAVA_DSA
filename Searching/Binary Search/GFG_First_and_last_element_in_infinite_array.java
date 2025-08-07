// Find position of an element in a sorted array of infinite numbers

// Given a sorted array arr[] of infinite numbers. The task is to search for an element k in the array.

// Examples:

// Input: arr[] = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], k = 10
// Output: 4
// Explanation: 10 is at index 4 in array.

// Input: arr[] = [2, 5, 7, 9], k = 3
// Output: -1
// Explanation: 3 is not present in array. [AMAZON INTERVIEW EXPERIENCE]


public class GFG_First_and_last_element_in_infinite_array {

    public static void main(String[] args) {

        int[]arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        System.out.println(ans(arr, target));
        
    }

    static int ans(int[]arr , int target){
        int start = 0;
        int end = 1;

        //Condition for the target to lie in the range

        while (target > arr[end]){
            int newStart = end + 1;
            //Doubling the end

            end = end + (end - start + 1)*2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[]arr, int target , int start, int end){
        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }

            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}