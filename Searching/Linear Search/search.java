//Search if an element exists in the array or not. If it exists, return the index of the element in the array, otherwise -1

import java.util.Scanner;

public class search{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [] arr = {11, 12, 13, 14, 15, 16 , 17};

        System.out.print("Enter the number you wish to search in the array: ");
        
        int target = sc.nextInt();

        System.out.println(linearSeach(arr, target));

        
    }

    static int linearSeach(int[]arr , int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}