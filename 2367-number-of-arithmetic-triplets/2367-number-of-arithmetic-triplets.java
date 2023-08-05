class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans =0;
        for(int i=0; i<nums.length-2;i++){
            int count =0;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]-nums[i]==diff || nums[j]-nums[i]==2*diff){
                    count++;
                }
            }
            if(count >= 2){
                ans++;
            }
        }

        return ans;
        
    }
}