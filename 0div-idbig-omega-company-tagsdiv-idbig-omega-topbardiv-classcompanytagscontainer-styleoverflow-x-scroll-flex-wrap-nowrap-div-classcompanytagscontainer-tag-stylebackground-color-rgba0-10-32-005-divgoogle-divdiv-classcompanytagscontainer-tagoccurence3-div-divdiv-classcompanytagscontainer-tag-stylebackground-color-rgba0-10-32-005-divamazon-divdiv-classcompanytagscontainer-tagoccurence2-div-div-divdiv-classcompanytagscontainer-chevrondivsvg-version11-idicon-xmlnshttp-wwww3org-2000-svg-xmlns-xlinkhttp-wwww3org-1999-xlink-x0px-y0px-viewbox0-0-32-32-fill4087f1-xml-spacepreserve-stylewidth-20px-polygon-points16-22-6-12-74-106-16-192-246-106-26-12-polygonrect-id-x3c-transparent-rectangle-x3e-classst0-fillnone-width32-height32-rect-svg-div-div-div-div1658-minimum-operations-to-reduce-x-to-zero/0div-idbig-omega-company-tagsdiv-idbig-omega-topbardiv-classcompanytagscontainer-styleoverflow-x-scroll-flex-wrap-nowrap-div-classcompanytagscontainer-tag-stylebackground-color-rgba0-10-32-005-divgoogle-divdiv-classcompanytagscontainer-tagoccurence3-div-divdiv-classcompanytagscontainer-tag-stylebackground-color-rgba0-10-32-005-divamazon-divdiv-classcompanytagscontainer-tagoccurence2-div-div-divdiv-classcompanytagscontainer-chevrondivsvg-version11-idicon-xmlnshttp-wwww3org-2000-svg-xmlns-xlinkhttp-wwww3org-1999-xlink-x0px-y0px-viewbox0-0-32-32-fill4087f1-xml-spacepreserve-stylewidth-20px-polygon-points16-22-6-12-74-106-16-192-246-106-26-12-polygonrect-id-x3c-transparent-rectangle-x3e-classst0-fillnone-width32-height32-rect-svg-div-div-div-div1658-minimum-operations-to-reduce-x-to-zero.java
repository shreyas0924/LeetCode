class Solution {
     public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        for(int e: nums) {
            sum += e;
        }
        //find if there is a subarray sum is sum - x
        sum -= x;
        if(sum < 0) return -1;
        int prevIndex = 0;
        int maxSubArraySize = -1;
        //sliding window to find max sub array size
        for(int i = 0; i < n; i++) {
            sum -= nums[i];

            while(sum < 0) {
                sum += nums[prevIndex++];
            }
            if(sum == 0) {
                maxSubArraySize = Math.max(maxSubArraySize, i - prevIndex + 1);
            }
        }
        //min left and right = n - max sub array size
        return maxSubArraySize == -1 ? -1 : n - maxSubArraySize;
    }
}