class Solution {
    public int[] searchRange(int[] nums, int target) {
           
        int[] res = new int[2];
        
        res[0] = first(nums, target);
        res[1] = second(nums,target);
       
        return res;
    }
    
    public int first(int[] nums, int target){ //first half
        int l = 0;
        int h = nums.length - 1;
        int ans = -1;
        while(l <= h){
            int m = (l + h)/2;
            
            if(nums[m] == target){
                ans = m;
                h = m-1;
            }
            else if(nums[m] > target){
                h = m-1;
            }
            else l = m+1;
        }
        
        return ans;
    }
    
    public int second(int[] nums, int target){  //second half
        int l = 0;
        int h = nums.length - 1;
        int ans = -1;
        while(l <= h){
            int m = (l + h)/2;
            
            if(nums[m] == target){
                ans = m;
                l = m+1;
            }
            else if(nums[m] > target){
                h = m-1;
            }
            else l = m+1;
        }
        
        return ans;
    }
}