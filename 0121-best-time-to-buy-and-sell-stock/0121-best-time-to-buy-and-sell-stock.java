class Solution {
    public int maxProfit(int[] prices) {
        int min_sum = Integer.MAX_VALUE;
        int max_sum=0;
        for(int i=0;i<prices.length;i++){
            min_sum = Math.min(min_sum,prices[i]);
            max_sum = Math.max(max_sum,prices[i]-min_sum);
            
        }
        return max_sum;
    }
}