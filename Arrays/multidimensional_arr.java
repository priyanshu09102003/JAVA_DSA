import java.util.Scanner;

public class multidimensional_arr {

    public static void main(String[] args) {
      /*  1 2 3 
          4 5 6 
          7 8 9
       */

       Scanner sc = new Scanner(System.in);

       int [][] arr = new int[3][3];

       //input

       System.out.println("Enter the numbers of the 2d array: ");

       for(int row = 0; row<arr.length; row++){
        for(int col = 0; col<arr[row].length; col++){
            arr[row][col] = sc.nextInt();
        }
       }

       //output

       for(int row = 0; row<arr.length; row++){
        for(int col = 0; col<arr[row].length; col++){
            System.out.print(arr[row][col] + " ");
        }

        System.out.println();
       }

    }
}