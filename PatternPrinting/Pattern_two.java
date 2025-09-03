/* 
    *****
    *****
    *****
    *****
    *****
 */

 public class Pattern_two {
 
    public static void main(String[] args) {

        pattern_two(4);
        
    }

    static void pattern_two(int n){

        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
 }
