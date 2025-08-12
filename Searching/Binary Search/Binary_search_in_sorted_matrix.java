public class Binary_search_in_sorted_matrix {

    public static void main(String[] args) {
        
    }

    static int[]binarySearch(int[][]matrix ,int row, int colStart, int colEnd, int target){

        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row , mid};
            }

            if(matrix[row][mid] < target){
                colStart = mid + 1;
            }

            else{
                colEnd = mid - 1;
            }
        }

        return new int[]{-1 , -1};

    }

    static int[]search(int[][]matrix , int target){
        int row = matrix.length;
        int col = matrix[0].length;

        if(row == 1){
            return binarySearch(matrix, 0, 0, col, target);
        }

        int rowStart = 0;
        int rowEnd = row - 1;
        int colMid = col / 2;

        while(rowStart < (rowEnd - 1)){
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if(matrix[mid][colMid] == target){
                return new int[]{mid , colMid};
            }

            if(matrix[mid][colMid] < target){
                rowStart = mid;
            }

            else{
                rowEnd = mid;
            }
        }

}