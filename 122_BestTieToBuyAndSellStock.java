class 122_BestTieToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit= 0, sum=0;
        int buy = prices[0];
        int length = prices.length;
        
        //corner case
        if(length < 2)
            return 0;
        
        for(int i=1; i< length; i++)
        {
            if(prices[i]-buy >0)
            {
                sum += prices[i] -buy; 
            }
            buy = prices[i];
        }
        return sum;
    }
}