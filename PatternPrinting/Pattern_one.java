/* 
    *
    **
    ***
    ****
    *****
 */

public class Pattern_one {

    public static void main(String[] args) {

        pattern_one(4);
        
    }

    static void pattern_one(int n){
        
        //outer loop for the rows

        for(int row = 1; row<=n; row++){

            //Inner loop for the coloumns
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }

            System.out.println();
            
        }
    }
}