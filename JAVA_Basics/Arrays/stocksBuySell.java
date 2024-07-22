package JAVA_Basics.Arrays;

public class stocksBuySell {
    public static int stocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;   // + infinity
        int maxProfit = 0;

        for(int i=0; i<prices.length;i++){

            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;   // today's profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int finalProfit = stocks(prices);
        System.out.println("The maximum profit is: Rs." + finalProfit);
    }
}
