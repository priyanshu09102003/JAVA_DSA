//Find the numbers with even Digits - LEETCODE 1295

//Given array of digit. return how many of them contain even number of digit

public class LeetCode_1295 {

    public static void main(String[] args) {

        int []nums = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));
        
    }

    static int findNumbers(int[]nums){
       int count = 0;
       
       for(int num : nums){
        if(even(num)){
            count ++;
        }
       }

       return count;
    }

    //Function to check if it is even
    static boolean even(int num){
        
        int numberOfDigits = digits(num);

        if(numberOfDigits % 2 == 0){
            return true;
        }

        return false;


    }

    //Function to count the number of digits

    // static int digits(int num){

    //     if(num<0){
    //         num = num * (-1);
    //     }

    //     if(num == 0){
    //         return 1;
    //     }

    //     int count = 0;

    //     while(num>0){
    //         count++;
    //         num = num/10;
    //     }

    //     return count;
    // }


    //Shortcut to find the number of digits

    static int digits(int num){
        if(num<0){
            num = num * (-1);
        }

        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num))+1;
    }
}