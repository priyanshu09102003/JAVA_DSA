public class practice {

    public static void main(String[]args){

        int[] nums = {23 , 45, 1, 2, 8 ,19, -11, -16, -27};

        int target = 99;

        System.out.println("The target element is at: " + LinearSearch(nums, target));

    }

    //Searching the array - Linear seach

    static int LinearSearch(int[]arr , int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i<arr.length; i++){
            //Check for the element at every index

            int element = arr[i];

            //if the element is equal to the target element, return the index of the element
            if(element == target){
                
                return i;
            }

        }

        //this line executes if none of the return statements above is not executed and hence the target is not found

        return -1;
    }

    
}