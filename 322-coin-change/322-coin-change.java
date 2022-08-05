class Solution {
    
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i = 1; i <= amount; i++) {
            for(int e: coins) {
                if(i == e) {
                    dp[i] = 1;
                    break;
                }
                
                if(i - e < 0 || dp[i - e] == Integer.MAX_VALUE) continue;
                // i - e > 0
                dp[i] = Math.min(dp[i], dp[i - e] + 1);
            }
        }
        
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
    
}