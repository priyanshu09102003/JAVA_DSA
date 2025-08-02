//Find the minimum number in the array


public class min_element {

    public static void main(String[] args) {

        int[]arr = {22, 3, -5, 88, 2, 11, 98, 44};

        System.out.println(min(arr));
        
    }

    static int min(int[]arr){
        int min = arr[0];

        for(int i = 0; i<arr.length ; i++){
            if(min>arr[i]){
                 min = arr[i];
            }
        }

        System.out.print("The minimum element in the array is: ");

        return min;
    }
}