//Search a particular element in the array using BINARY search
public class bs_one {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 12, 14, 16, 18, 22, 25, 29};
        int target = 6;
        
        int ans = binarySearch(arr, target);  
        
        System.out.println(ans);
    }
    
    //Function to return the index
    static int binarySearch(int[] arr, int target) {  
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            //Find the middle element
            int mid = start + (end - start) / 2;
            
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;  
            }
        }
        
        return -1;  
    }
}