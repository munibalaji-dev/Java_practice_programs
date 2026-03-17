package DSA_Basic_Algorithms;

public class BestTimeToBuyandSellStock {
    static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i=1;i<prices.length;i++){
            int cost = prices[i] - minPrice;

            if (cost > maxProfit){
                maxProfit = cost;
            }
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
//            maxProfit = Math.max(maxProfit, cost);
//            minPrice = Math.min(minPrice, prices[i]);
        }
        System.out.println("profit was : "+maxProfit);

    }
}
