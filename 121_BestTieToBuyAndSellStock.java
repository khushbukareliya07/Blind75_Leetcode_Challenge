class 121_BestTieToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        
        int min_buy_stock =prices[0]; 
        int max_profit =0;
        
        for(int i=1; i<prices.length;i++)
        {
            max_profit = Math.max(max_profit, prices[i]-min_buy_stock);
            
            min_buy_stock = Math.min(min_buy_stock, prices[i]);
        }
        return max_profit;
        
    }
}