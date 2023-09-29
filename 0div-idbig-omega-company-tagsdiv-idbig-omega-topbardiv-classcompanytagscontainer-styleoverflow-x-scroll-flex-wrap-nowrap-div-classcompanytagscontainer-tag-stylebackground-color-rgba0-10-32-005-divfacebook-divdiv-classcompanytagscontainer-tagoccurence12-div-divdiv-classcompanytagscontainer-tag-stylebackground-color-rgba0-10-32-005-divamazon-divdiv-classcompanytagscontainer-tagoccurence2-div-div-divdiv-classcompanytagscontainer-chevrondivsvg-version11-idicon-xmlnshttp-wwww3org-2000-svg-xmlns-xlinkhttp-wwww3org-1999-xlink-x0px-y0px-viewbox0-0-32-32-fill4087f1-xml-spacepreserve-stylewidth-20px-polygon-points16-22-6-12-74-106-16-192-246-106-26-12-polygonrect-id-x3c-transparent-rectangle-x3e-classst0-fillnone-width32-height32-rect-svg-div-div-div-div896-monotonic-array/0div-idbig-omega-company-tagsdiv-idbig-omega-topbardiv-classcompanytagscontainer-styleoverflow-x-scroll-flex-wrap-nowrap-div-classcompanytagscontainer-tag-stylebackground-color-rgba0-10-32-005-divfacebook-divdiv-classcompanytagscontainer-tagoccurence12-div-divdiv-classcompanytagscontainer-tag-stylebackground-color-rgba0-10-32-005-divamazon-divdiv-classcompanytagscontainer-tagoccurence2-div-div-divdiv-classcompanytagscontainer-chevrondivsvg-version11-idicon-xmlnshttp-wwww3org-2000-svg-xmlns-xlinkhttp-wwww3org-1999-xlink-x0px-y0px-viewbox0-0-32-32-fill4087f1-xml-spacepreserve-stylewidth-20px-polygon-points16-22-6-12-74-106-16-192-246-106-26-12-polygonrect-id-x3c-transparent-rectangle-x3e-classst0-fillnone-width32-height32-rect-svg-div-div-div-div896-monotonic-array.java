class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = false;
        boolean decreasing = false;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] < nums[i-1]) decreasing = true;
            if(nums[i] > nums[i-1]) increasing = true;
        }
        
        return increasing && decreasing ? false : true;
    }
}