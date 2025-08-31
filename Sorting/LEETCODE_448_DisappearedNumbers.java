import java.util.*;

public class LEETCODE_448_DisappearedNumbers {



    public List<Integer> missingNumbers(int[]nums){

    //Step1: Cyclic sort the arr
        int i = 0;

        while(i<nums.length){
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){
                swapNumbers(nums, i, correctIndex);
            }

            else{
                i++;
            }
        }
    
        //Step2: Search the array and check for the missing numbers

        List<Integer> missingNumbers = new ArrayList<>();

        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index+1){
                missingNumbers.add(index + 1);
            }
        }

        return missingNumbers;
       
    }

    static void swapNumbers(int[]arr, int firstNumber, int secondNumber){
        int temp = arr[firstNumber];
        arr[firstNumber] = arr[secondNumber];
        arr[secondNumber] = temp;
    }
}