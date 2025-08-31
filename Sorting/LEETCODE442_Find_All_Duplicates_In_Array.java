import java.util.ArrayList;
import java.util.List;

public class LEETCODE442_Find_All_Duplicates_In_Array {


    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        while(i<nums.length){
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }

            else {
                i++;
            }
        }

        List<Integer> duplicateList = new ArrayList<>();

        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index+1){
                duplicateList.add(index);
            }
        }

        return duplicateList;
    }

    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}