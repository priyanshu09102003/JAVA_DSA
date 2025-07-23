//Printing the maximum value in the ARRAY

public class maximum {

    public static void main(String[] args) {
        
        int[] arr = {1 , 4, 6, 8, 2};

       System.out.println(max(arr));
    }

    static int max(int[]arr){

         int Max = Integer.MIN_VALUE;

         for(int i : arr){
            if(i>Max){
                Max = i;
            }
         }

         return Max;
    }
       

}