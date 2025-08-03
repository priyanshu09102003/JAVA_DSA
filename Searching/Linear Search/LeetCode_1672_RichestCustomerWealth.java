//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has. A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

public class LeetCode_1672_RichestCustomerWealth {

    public static void main(String[] args) {

        int [][] accounts = {{1,2,3},{3,2,1}};

        System.out.println(maximumWealth(accounts));

        
    }

    static int maximumWealth(int[][] accounts) {

        //Person = row
        //Account = cols

        //Iterating the 2d array

        //initialising maximum and sum

        int max_wealth = Integer.MIN_VALUE;
    
        for(int person = 0; person<accounts.length; person++){
            int sum = 0;

            for(int account = 0; account<accounts[person].length; account++){

                sum = (sum + accounts[person][account]);

            }


            //checking the maximum

            if(max_wealth<sum){
                max_wealth = sum;
            }
        }

        return max_wealth;
        
    }
}