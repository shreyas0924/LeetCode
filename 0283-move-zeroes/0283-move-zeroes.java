class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        while(j <  nums.length && i < nums.length ){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
                j++;
            }
            else
                j++;
        
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
    
}