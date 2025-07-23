import java.util.Arrays;
import java.util.Scanner;

public class array_one {

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Array of primitives
        // int [] roll_no;
        // roll_no = new int[5];
       
        // //inputs using for loops

        // System.out.println("Enter 5 numbers of the array: ");

        // for(int i =0; i<roll_no.length; i++){
        //     roll_no[i] = sc.nextInt();
        // }

        // System.out.println("The array is: ");

        //Representing the normal for loop

        // for(int i = 0; i<roll_no.length; i++){
        //     System.out.print(roll_no[i] + " ");
        // }

        //Using the FOR-EACH loop

        // for(int element : roll_no){
        //     System.out.print(element + " ");
        // }



        //Array of objects

        String[] str = new String[4];

        System.out.println("Enter strings: ");

        for(int i = 0; i<str.length; i++){

            str[i] = sc.next();

        }

        System.out.println(Arrays.toString(str));
    }

    
}