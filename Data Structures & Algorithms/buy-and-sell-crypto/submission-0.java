class Solution {
    public int maxProfit(int[] prices) {
int profit=0;
int minp=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            profit=prices[i]-minp;
            if(prices[i]<minp) minp=prices[i];
            max=Math.max(max,profit);


        
        }
        return max;
    }
}
