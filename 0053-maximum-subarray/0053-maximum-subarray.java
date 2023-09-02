class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        
        dp[0] = nums[0];
        int max = nums[0];
        
        for(int i=1;i<n;i++){
            dp[i] = Math.max(nums[i] + dp[i-1], nums[i]);
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}