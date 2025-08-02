//Search for an element in a particular range Index

public class search_in_range {
    public static void main(String[] args) {

        int[]arr = {22, 100, 67, 56, 89, 54, 76, 2, 9};
        int target = 54;
        int start = 2;
        int end = 6;

        System.out.println(search_in_range(arr, target, start, end));
    
    }

    static int search_in_range(int[]arr, int target , int start, int end){

        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i<=end; i++){
            if(target == arr[i]){
                return i;
            }
        }

        return -1;

    }
}
