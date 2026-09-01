class Solution {
    public int maxProfit(int[] prices) {
        
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                 maxprofit=Math.max(profit,maxprofit);

            }
            else{
                buyprice=prices[i];
            }
        }
        if(maxprofit<=0){
            return 0;
        }
        else{
            return maxprofit;
        }

    }
}