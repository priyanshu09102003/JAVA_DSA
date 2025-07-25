public class minimum_number {

    public static void main(String[] args) {

        int [] arr = {22, 2, 3, 4, 5, 6};
        System.out.println("The minimum number in the array is: " + minimum_number(arr));
        
    }

    static int minimum_number(int[]arr){

        int minimum_number = arr[0];

        for(int index = 0; index<arr.length; index++){
            int element = arr[index];

            if(minimum_number>element){
               minimum_number = element;

               
            }
        }

        return minimum_number;
    }
}