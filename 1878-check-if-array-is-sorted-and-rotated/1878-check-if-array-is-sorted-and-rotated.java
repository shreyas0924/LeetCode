class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int counter=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                counter++;
            }
        }
        if(counter>1){
                return false;
            }
        return true;
    }
}