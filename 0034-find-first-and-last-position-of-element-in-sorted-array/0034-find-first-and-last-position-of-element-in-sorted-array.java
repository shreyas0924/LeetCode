class Solution {
    public int[] searchRange(int[] nums, int target) {
           

        //two poitners
        // int arr[]=new int[2];
        // arr[0]=-1;
        // arr[1]=-1;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)
        //     {
        //     arr[0]=i;
        //     break;
        //     }
        // }
        // for(int j=nums.length-1;j>=0;j--)
        // {
        //     if(nums[j]==target)
        //     {
        //     arr[1]=j;
        //     break;
        //     }
        // }
        // return arr;
        
        
        
        //binary search
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