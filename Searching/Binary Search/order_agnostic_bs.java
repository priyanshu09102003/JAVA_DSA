public class order_agnostic_bs {

        public static void main(String[] args) {
            

        }

        static int binarySearch(int[]arr , int target){

            int start = 0;
            int end = arr.length - 1 ;

            //Find whether the array is sorted in ascending / descending

            boolean isAsc = arr[start] < arr[end];

            while(start <= end){
                int mid = (start + (end - start)) / 2 ;

                if(arr[mid] == target){
                return mid;}

                if(isAsc){
                    if(arr[mid] < target){
                        start = mid + 1 ;
                    }

                    else{
                        end = mid - 1;
                    }
                }
                else{

                    if(arr[mid] < target){
                        end = mid - 1 ;
                    }

                    else{
                        start = mid + 1;
                    }

                }

            }

           
            return -1;

            
        }
    
}