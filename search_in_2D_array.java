public class search_in_2D_array {

    public static void main(String[] args) {
        
        int[][] arr = {
            {23 , 4, 1},
            {18, 12, 3, 9},
            {77 , 99, 34, 56},
            {18, 12}
        };

        int target = 56;

        search(arr, target);
       
    }

    static void search(int[][]arr , int target){

        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    System.out.println("Found");
                }

                if(arr[row][col] != target){
                    System.out.println("Not found");
                }

            }
        }

        
         
    }
}