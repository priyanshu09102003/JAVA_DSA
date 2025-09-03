/* 
    *****
    ****
    ***
    **
    *

 */

public class Pattern_three {

    public static void main(String[] args) {
        pattern_three(5);
    }

    static void pattern_three(int n){

        for(int row = 1; row<=n; row++){
            for(int col = n; col>=row; col--){
                System.out.print(" * ");
            }

            System.out.println();
        }

    }
}